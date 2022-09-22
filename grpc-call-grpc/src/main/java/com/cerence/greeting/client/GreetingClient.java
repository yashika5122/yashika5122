package com.cerence.greeting.client;


import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.proto.dummy.DummyServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class GreetingClient {

    public static void main(String[] args) {
        System.out.println(" i am grpc client");

        GreetingClient main = new GreetingClient();
        main.run();
        System.out.println("creating channel");
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6001)
                .usePlaintext()
                .build();
        doUnaryCall(channel);
//        doServerStreamingCall(channel);
//        doClientStreamingCall(channel);
//        doBiDiStreamingCall(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();
    }

    private void doUnaryCall(ManagedChannel channel) {
        //created the greet service client (blocking - synchronus)
        GreetServiceGrpc.GreetServiceBlockingStub greetclient = GreetServiceGrpc.newBlockingStub(channel);

        //Created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setInputLanguage("English")
                .setInputString("I m okay")
                .build();

        //do the same for the GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        // call the RPC and get back a GreetResponse (protocol Buffers)
        GreetResponse greetResponse = greetclient.greet(greetRequest);

        System.out.println(greetResponse.getResult());
    }

    private void doServerStreamingCall(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceBlockingStub greetclient = GreetServiceGrpc.newBlockingStub(channel);

        GreetManyTimesRequest greetManyTimesRequest = GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setInputLanguage("English").setInputString("what's up"))
                .build();

        greetclient.greetManyTimes(greetManyTimesRequest)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });
    }

    private void doClientStreamingCall(ManagedChannel channel) {
        //create asynchronous call
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse longGreetResponse) {
                //we get response from the server
                //onNext will be called only once
                System.out.println("Received a response from the server");
                System.out.println(longGreetResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                //we get error from the server
            }

            @Override
            public void onCompleted() {
                //the server is done
                System.out.println("Server has completed");
                latch.countDown();
            }
        });
        System.out.println("sending message 1");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setInputLanguage("Hindi")
                        .build())
                .build());

        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setInputLanguage("english")
                        .build())
                .build());

        System.out.println("sending message 2");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setInputLanguage("French")
                        .build())
                .build());

        System.out.println("sending message 3");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setInputLanguage("Spanish")
                        .build())
                .build());
        //we tell the server that client is done sending data
        requestObserver.onCompleted();
        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doBiDiStreamingCall(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<GreetEveryoneRequest> requestObserver = asyncClient.greetEveryone(new StreamObserver<GreetEveryoneResponse>() {
            @Override
            public void onNext(GreetEveryoneResponse greetEveryoneResponse) {
                System.out.println("Response from server" + greetEveryoneResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList("Hindi", "Bhojpuri", "Magadhi").forEach(
                lang -> requestObserver.onNext(GreetEveryoneRequest.newBuilder()
                        .setGreeting(Greeting.newBuilder()
                                .setInputLanguage(lang)
                                .build())
                        .build())
        );
        requestObserver.onCompleted();

        try {
            latch.await(3,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String httpcall(String inputString, String inputLanguage){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6001)
                .usePlaintext()
                .build();
        GreetServiceGrpc.GreetServiceBlockingStub greetclient = GreetServiceGrpc.newBlockingStub(channel);

        //Created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setInputLanguage(inputLanguage)
                .setInputString(inputString)
                .build();

        //do the same for the GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        // call the RPC and get back a GreetReponse (protocol Buffers)
        GreetResponse greetResponse = greetclient.greet(greetRequest);

        System.out.println("HttpCall :"+greetResponse.getResult());
        return greetResponse.getResult();
    }
}

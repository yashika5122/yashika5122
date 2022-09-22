package com.cerence.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //extract the field
        Greeting greeting = request.getGreeting();
        String inputLanguage = greeting.getInputLanguage();
        String inputString = greeting.getInputString();

        //create the response
        String result = "For " + inputLanguage + "this is the vlaue :" + inputString;
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        String inputLanguage = request.getGreeting().getInputLanguage();
        String inputString = request.getGreeting().getInputString();

        try {
            for (int i = 0; i < 10; i++) {
                String result = "(ManyTimes)For " + inputLanguage + " this is the value :" + inputString;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<LongGreetRequest>() {
            String result = "";

            @Override
            public void onNext(LongGreetRequest longGreetRequest) {
                //client send a message
                result += "For " + longGreetRequest.getGreeting().getInputLanguage() + " this is the value :" +
                        longGreetRequest.getGreeting().getInputString();
            }

            @Override
            public void onError(Throwable throwable) {
                //client sends a error
            }

            @Override
            public void onCompleted() {
                //client is done
                responseObserver.onNext(LongGreetResponse.newBuilder()
                        .setResult(result)
                        .build());
                responseObserver.onCompleted();
            }

        };
        return requestObserver;
    }

    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {
        StreamObserver<GreetEveryoneRequest> requestObserver = new StreamObserver<GreetEveryoneRequest>() {
            @Override
            public void onNext(GreetEveryoneRequest greetEveryoneRequest) {
                String result = "For " + greetEveryoneRequest.getGreeting().getInputLanguage();
                GreetEveryoneResponse greetEveryoneResponse = GreetEveryoneResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(greetEveryoneResponse);
            }

            @Override
            public void onError(Throwable throwable) {
                //do nothing for now
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }

}

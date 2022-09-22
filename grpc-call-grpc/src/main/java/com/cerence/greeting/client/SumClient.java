package com.cerence.greeting.client;

import com.proto.sum.InputRequest;
import com.proto.sum.InputResponse;
import com.proto.sum.InputServiceGrpc;
import com.proto.sum.InputValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",7001)
                .usePlaintext()
                .build();

        System.out.println("created sum channel");

        InputServiceGrpc.InputServiceBlockingStub inputServiceBlockingStub = InputServiceGrpc.newBlockingStub(managedChannel);

        InputValue inputValue = InputValue.newBuilder()
                .setFirstNumber(3)
                .setSecondNumber(10)
                .build();

        InputRequest inputRequest = InputRequest.newBuilder()
                .setInput(inputValue)
                .build();

        InputResponse inputResponse = inputServiceBlockingStub.input(inputRequest);

        System.out.println(inputResponse.getResult());
        System.out.println("shutting dowm sum channel");

        managedChannel.shutdown();
    }
}

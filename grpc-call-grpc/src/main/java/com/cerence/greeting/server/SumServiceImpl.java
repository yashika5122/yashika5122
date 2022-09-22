package com.cerence.greeting.server;

import com.proto.sum.InputRequest;
import com.proto.sum.InputResponse;
import com.proto.sum.InputServiceGrpc;
import com.proto.sum.InputValue;
import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends InputServiceGrpc.InputServiceImplBase {
    @Override
    public void input(InputRequest request, StreamObserver<InputResponse> responseObserver) {
        InputValue inputValue = request.getInput();
        int first_number = inputValue.getFirstNumber();
        int second_number = inputValue.getSecondNumber();

        int result = first_number + second_number;

        InputResponse inputResponse = InputResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(inputResponse);
        responseObserver.onCompleted();
    }
}

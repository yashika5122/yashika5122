package com.cerence;

import com.cerence.proto.TextProcessorInput;
import com.cerence.proto.TextProcessorInputRequest;
import com.cerence.proto.TextProcessorInputResponse;
import com.cerence.proto.TextProcessorServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TextProcessorImpl extends TextProcessorServiceGrpc.TextProcessorServiceImplBase {

    @Override
    public void textProcessorBing(TextProcessorInputRequest request, StreamObserver<TextProcessorInputResponse> responseObserver) {

        TextProcessorInput textProcessorInput = request.getProcessorInput();
        String inputLanguage = textProcessorInput.getInputLanguage();
        String inputString = textProcessorInput.getInputString();
        String result = "For " + inputLanguage + "this is the value : " + inputString;
        System.out.println("Result: "+result);

        TextProcessorInputResponse response = TextProcessorInputResponse.newBuilder()
                .setResult(result)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void textProcessorEmoji(TextProcessorInputRequest request, StreamObserver<TextProcessorInputResponse> responseObserver) {
        TextProcessorInput textProcessorInput = request.getProcessorInput();
        String inputLanguage = textProcessorInput.getInputLanguage();
        String inputString = textProcessorInput.getInputString();
        String result = "For " + inputLanguage + "this is the value : " + inputString;
        System.out.println("Result: "+result);

        TextProcessorInputResponse response = TextProcessorInputResponse.newBuilder()
                .setResult(result)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void textProcessorAcronyms(TextProcessorInputRequest request, StreamObserver<TextProcessorInputResponse> responseObserver) {
        TextProcessorInput textProcessorInput = request.getProcessorInput();
        String inputLanguage = textProcessorInput.getInputLanguage();
        String inputString = textProcessorInput.getInputString();
        String result = "For " + inputLanguage + "this is the value : " + inputString;
        System.out.println("Result: "+result);

        TextProcessorInputResponse response = TextProcessorInputResponse.newBuilder()
                .setResult(result)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void textProcessorSpellChecker(TextProcessorInputRequest request, StreamObserver<TextProcessorInputResponse> responseObserver) {
        TextProcessorInput textProcessorInput = request.getProcessorInput();
        String inputString = textProcessorInput.getInputString();
        String result = "For " + "this is the value : " + inputString;
        System.out.println("Result: "+result);

        TextProcessorInputResponse response = TextProcessorInputResponse.newBuilder()
                .setResult(result)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }
}

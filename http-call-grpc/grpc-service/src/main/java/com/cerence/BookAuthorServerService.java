package com.cerence;

import com.proto.textProcessor.Author;
import com.proto.textProcessor.BookAuthorServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {
    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        TempDB.getAuthorFromTempDB()
                .stream()
                .filter(author -> author.getAuthorId() == request.getAuthorId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }

   /* @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {

        String inputLanguage = request.getFirstName();
        String inputString = request.getLastName();
        String result = "For " + inputLanguage + "this is the value : " + inputString;
        System.out.println(result);
        Author response = Author.newBuilder()
                .setFirstName(inputLanguage)
                .setLastName(inputString)
                .build();

        //send response to client
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }*/
}

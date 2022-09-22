package com.cerence.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SumServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server SumServer = ServerBuilder.forPort(7001)
                .addService(new SumServiceImpl())
                .build();

        SumServer.start();
        System.out.println("channel started");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received SumServer Shutdown Request");
            SumServer.shutdown();
            System.out.println("SumServer stopped ");
        }));
        SumServer.awaitTermination();
    }
}

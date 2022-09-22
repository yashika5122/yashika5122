package com.cerence.greeting.server;

import com.proto.greet.GreetRequest;

public class ApiImpl {
    public static String hello(GreetRequest request) {
        // do work
        return "Hello  " + request.getGreeting();
    }
}

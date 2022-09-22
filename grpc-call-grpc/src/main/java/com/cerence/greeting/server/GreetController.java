package com.cerence.greeting.server;

import com.cerence.greeting.client.GreetingClient;
import com.cerence.greeting.server.GreetServiceImpl;
import com.proto.greet.GreetRequest;
import com.proto.greet.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class GreetController {

    @Autowired
    ApiImpl apicall;
    @GetMapping("/hello")
    public String greetingValidator(@RequestParam("inputString") String inputString,@RequestParam("inputLanguage") String inputLanguage) throws IOException {
        Greeting greeting = Greeting.newBuilder()
                .setInputLanguage(inputLanguage)
                .setInputString(inputString)
                .build();

        //do the same for the GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();
        String result = apicall.hello(greetRequest);
        return result;
    }

}

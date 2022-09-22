package com.cerence.service;

import com.cerence.proto.TextProcessorInput;
import com.cerence.proto.TextProcessorInputRequest;
import com.cerence.proto.TextProcessorInputResponse;
import com.cerence.proto.TextProcessorServiceGrpc;
//import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class AcronymsClientService {

//    @GrpcClient("grpc-cerence-service")
//    TextProcessorServiceGrpc.TextProcessorServiceBlockingStub client;

    public Map<String, String> acronymService(String content, String language) throws IOException {
        /*TextProcessorInput textProcessorInput = TextProcessorInput.newBuilder()
                .setInputString(content)
                .setInputLanguage(language)
                .build();

        TextProcessorInputRequest textProcessorInputRequest = TextProcessorInputRequest.newBuilder()
                .setProcessorInput(textProcessorInput)
                .build();

        TextProcessorInputResponse textProcessorInputResponse= client.textProcessorAcronyms(textProcessorInputRequest);
        System.out.println("textProcessorInputResponse: "+textProcessorInputResponse);*/

        StringBuilder sb = new StringBuilder();
        Map<String,String> response=new HashMap<>();
        response.put("language",language);

        String filePath = new File("").getAbsolutePath();
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(filePath+"/client-service/src/main/resources/Acronyms/AcronymsLanguageList.yml");
        HashMap yamlMap = yaml.load(inputStream);
        String languageFile = (String) yamlMap.get(language);
        System.out.println("languageFile = " + languageFile );

        String[] list = content.split(" ");
        Arrays.stream(list).forEach(t->sb.append(tsvr(t.toLowerCase(),languageFile)+" "));

        System.out.println("Acronymcs conversion :: "+sb.toString());
        response.put("Output", sb.toString());
        return response;
    }

    public static String tsvr(String searchString,String languageFile) {
        String Data = searchString;
        String filePath = new File("").getAbsolutePath();
        try (BufferedReader TSVReader = new BufferedReader(new FileReader(filePath+"/client-service/src/main/resources/Acronyms/"+languageFile))) {
            String line = null;
            while ((line = TSVReader.readLine()) != null) {
                String[] lineItems = line.split("\t"); //splitting the line and adding its items in String[]
                if((lineItems[0].toLowerCase()).equals(searchString)) {
                    Data = lineItems[1];
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return Data;
    }
}

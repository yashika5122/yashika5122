package com.cerence.service;

import com.cerence.proto.TextProcessorInput;
import com.cerence.proto.TextProcessorInputRequest;
import com.cerence.proto.TextProcessorInputResponse;
import com.cerence.proto.TextProcessorServiceGrpc;
//import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmojiClientService {
   /* @GrpcClient("grpc-cerence-service")
    TextProcessorServiceGrpc.TextProcessorServiceBlockingStub client;*/

    public Map<String, String> emojiService(String InputString, String language) throws IOException {

        /*TextProcessorInput textProcessorInput = TextProcessorInput.newBuilder()
                .setInputString(InputString)
                .setInputLanguage(language)
                .build();

        TextProcessorInputRequest textProcessorInputRequest = TextProcessorInputRequest.newBuilder()
                .setProcessorInput(textProcessorInput)
                .build();

        TextProcessorInputResponse textProcessorInputResponse= client.textProcessorBing(textProcessorInputRequest);
        System.out.println("textProcessorInputResponse: "+textProcessorInputResponse);*/

        Map<String,String> response=new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Yaml yaml = new Yaml();

        String filePath = new File("").getAbsolutePath();
        InputStream inputStream = new FileInputStream(filePath+"/client-service/src/main/resources/Emojis/LanguageList.yml");
        HashMap yamlMap = yaml.load(inputStream);
        String languageFile = (String) yamlMap.get(language);
        System.out.println("languageFile = " + languageFile );

        for (int i = 0; i < InputString.length(); i++) {
            if (Character.isSurrogate(InputString.charAt(i))) {
                Integer res = Character.codePointAt(InputString, i);
                i++;
                sb.append(tsvr(Integer.toHexString(res).toUpperCase(), languageFile));
            } else {
                sb.append(InputString.charAt(i));
            }
        }

        response.put("language",language);
        response.put("InputString",sb.toString());
        System.out.println("Unicode conversion :: "+sb.toString());
        //return sb.toString();
        return response;
    }

    public static String tsvr(String searchString,String languageFile) {
        String Data = null;
        String filePath = new File("").getAbsolutePath();
        try (BufferedReader TSVReader = new BufferedReader(new FileReader(filePath+"/client-service/src/main/resources/Emojis/"+languageFile))) {
            String line = null;
            while ((line = TSVReader.readLine()) != null) {
                String[] lineItems = line.split("\t"); //splitting the line and adding its items in String[]
                if(lineItems[1].equals(searchString)) {
                    Data = lineItems[2];
                    break;

                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        if (Data == null)
            Data = String.valueOf(Character.toChars(Integer.parseInt(searchString.trim(), 16)));

        return Data;
    }
}

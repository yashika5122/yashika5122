package com.cerence.service;

import com.google.protobuf.Descriptors;
import com.proto.textProcessor.Author;
import com.proto.textProcessor.BookAuthorServiceGrpc;
//import net.devh.boot.grpc.client.inject.GrpcClient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookAuthorClientService {
   /* @GrpcClient("grpc-cerence-service")
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub client;
*/
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId) throws IOException {
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();
//        Author authorRequest = Author.newBuilder()
//                .setFirstName(inputString)
//                .setLastName(inputLanguage)
//                .build();

       /* Author authorResponse = client.getAuthor(authorRequest);*/
       // return authorResponse.getAllFields();
        return null;
    }


}

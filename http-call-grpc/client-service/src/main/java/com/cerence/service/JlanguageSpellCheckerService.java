package com.cerence.service;

import com.cerence.proto.TextProcessorInput;
import com.cerence.proto.TextProcessorInputRequest;
import com.cerence.proto.TextProcessorInputResponse;
import com.cerence.proto.TextProcessorServiceGrpc;
//import net.devh.boot.grpc.client.inject.GrpcClient;
import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.CategoryId;
import org.languagetool.rules.RuleMatch;
import org.languagetool.tools.Tools;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.*;

@Service
public class JlanguageSpellCheckerService {

    /*@GrpcClient("grpc-cerence-service")
    TextProcessorServiceGrpc.TextProcessorServiceBlockingStub client;*/

    public Map<String, String> jlanguageSpellService(String inputString) throws IOException {

        /*TextProcessorInput textProcessorInput = TextProcessorInput.newBuilder()
                .setInputString(inputString)
                .build();

        TextProcessorInputRequest textProcessorInputRequest = TextProcessorInputRequest.newBuilder()
                .setProcessorInput(textProcessorInput)
                .build();

        TextProcessorInputResponse textProcessorInputResponse = client.textProcessorSpellChecker(textProcessorInputRequest);
        System.out.println(textProcessorInputResponse);*/

        Map<String, String> response = new HashMap<>();
        JLanguageTool jLanguageTool = new JLanguageTool(new AmericanEnglish());

        Set<CategoryId> categorySet = new LinkedHashSet<>();
        categorySet.add(new CategoryId("CASING"));
        categorySet.add(new CategoryId("TYPOGRAPHY"));
        Tools.selectRules(jLanguageTool, categorySet, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), false, false);

        List<RuleMatch> matches = jLanguageTool.check(inputString);
        String check = correctTextFromMatches(inputString, matches);
        System.out.println("correctTextFromMatches :: " + check);

        /*for (RuleMatch rm : Suggestion) {
            List<String> replacements = rm.getSuggestedReplacements();
            System.out.println("replacements ::"+ replacements);
            if (replacements.size() > 0) {
                inputString = BingSpellCheckerCall(inputString);
                System.out.println("BingSpellCheckerCall :: " + inputString);
            }
        }*/

       /* if (Suggestion.size() > 0) {
            inputString = BingSpellCheckerCall(inputString);
            System.out.println("BingSpellCheckerCall :: " + inputString);
        }*/
        response.put("InputString", inputString);
        return response;

    }

    public String BingSpellCheckerCall(String inputString) {

        StringBuilder sb = new StringBuilder();
        HttpURLConnection connection = null;
        try {
            URI path = new URI(
                    "http",
                    "localhost:8080",
                    "/bingspellchecker",
                    "inputString=" + inputString + "&inputLanguage=eng-USA",
                    null);
            String uri = path.toASCIIString();
            URL url = new URL(uri);

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            Map headerFields = connection.getHeaderFields();
            System.out.println("header fields are: " + headerFields);

            int rspCode = connection.getResponseCode();
            if (rspCode == 200) {
                InputStream ist = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(ist);
                BufferedReader br = new BufferedReader(isr);
                inputString = br.readLine();
                while (inputString != null) {
                    System.out.println("inputString " + inputString);
                    sb.append(inputString);
                    inputString = br.readLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return sb.toString();
    }

    public static String correctTextFromMatches(String contents, List<RuleMatch> matches) {
        StringBuilder sb = new StringBuilder(contents);
        List<String> errors = new ArrayList<>();
        for (RuleMatch rm : matches) {
            List<String> replacements = rm.getSuggestedReplacements();
            if (!replacements.isEmpty()) {
                errors.add(sb.substring(rm.getFromPos(), rm.getToPos()));
            }
        }
        int offset = 0;
        int counter = 0;
        for (RuleMatch rm : matches) {
            List<String> replacements = rm.getSuggestedReplacements();
            System.out.println("replacements ::" + replacements);
            if (!replacements.isEmpty()) {
                //make sure the error hasn't been already corrected:
                if (rm.getFromPos() - offset >= 0 &&
                        rm.getToPos() - offset >= rm.getFromPos() - offset &&
                        errors.get(counter).equals(sb.substring(rm.getFromPos() - offset, rm.getToPos() - offset))) {
                    sb.replace(rm.getFromPos() - offset, rm.getToPos() - offset, replacements.get(0));
                    offset += rm.getToPos() - rm.getFromPos() - replacements.get(0).length();
                }
                counter++;
            }
        }
        return sb.toString();
    }
}

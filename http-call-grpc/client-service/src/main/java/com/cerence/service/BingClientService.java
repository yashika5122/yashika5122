package com.cerence.service;

import com.cerence.proto.TextProcessorInput;
import com.cerence.proto.TextProcessorInputRequest;
import com.cerence.proto.TextProcessorInputResponse;
import com.cerence.proto.TextProcessorServiceGrpc;

//import net.devh.boot.grpc.client.inject.GrpcClient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Service
public class BingClientService {

/*    @GrpcClient("grpc-cerence-service")
    TextProcessorServiceGrpc.TextProcessorServiceBlockingStub client;*/

    static String endpoint = "https://api.bing.microsoft.com/v7.0/spellcheck";
    static String subscriptionKey = "58b328d9c6a64af3972e244975cf1584";
    static String mkt = "en-US";
    static String mode = "proof";
    Map<String, String> response = new HashMap<String, String>();


    public Map<String, String> bingspellservice(String inputString, String inputLanguage) throws Exception {
        /*TextProcessorInput textProcessorInput = TextProcessorInput.newBuilder()
                .setInputString(inputString)
                .setInputLanguage(inputLanguage)
                .build();

        TextProcessorInputRequest textProcessorInputRequest = TextProcessorInputRequest.newBuilder()
                .setProcessorInput(textProcessorInput)
                .build();

        TextProcessorInputResponse textProcessorInputResponse = client.textProcessorBing(textProcessorInputRequest);
        System.out.println(textProcessorInputResponse);*/

        try {
            String params = "?mkt=" + mkt + "&mode=" + mode;
            URL url = new URL(endpoint + params);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + inputString.length() + 5);
            connection.setRequestProperty("Ocp-Apim-Subscription-Key", subscriptionKey);
            connection.setDoOutput(true);

            // Optional
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes("text=" + inputString);
            wr.flush();
            wr.close();

            // Get results
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }

            in.close();

            JSONObject jsonObject = new JSONObject(sb.toString());
            JSONArray flaggedTokens = jsonObject.getJSONArray("flaggedTokens");

            StringBuffer input = new StringBuffer(inputString);
            for (int i = 0; i < flaggedTokens.length(); i++) {
                JSONObject flaggedTokensParse = flaggedTokens.getJSONObject(i);
                String token = flaggedTokensParse.getString("token");

                //fetch value of suggestion from json output
                int offset = input.indexOf(token);
                JSONArray suggestionsArray = flaggedTokensParse.getJSONArray("suggestions");
                JSONObject suggestionObject = suggestionsArray.getJSONObject(0);
                String suggestionString = suggestionObject.getString("suggestion");
                input.replace(offset, offset + token.length(), suggestionString);

            }

            response.put("Result", input.toString());
            response.put("Language", inputLanguage);
            System.out.println("Final = " + input);

        } catch (Exception e) {
            System.out.println(e);
        }
        return response;
    }
}

package com.cuenca.example;

import com.cuenca.CuencaClient;

public class Example {
    public static void main(String[] args) throws Exception {
        String API_KEY = "API_KEY";
        String API_SECRET = "API_SECRET";
        String endPointPost = "YOUR_ENDPOINT";
        String jsonBodyPost = "YOUR_JSON";
        CuencaClient client = new CuencaClient(API_KEY, API_SECRET);
        String response = client.post(endPointPost, jsonBodyPost).body();
        System.out.println("POST :" + response);
    }
}

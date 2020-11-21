package com.litovka.imageviewer.service;

import okhttp3.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

@Service
public class HttpService {

    private OkHttpClient okHttpClient = new OkHttpClient();
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public String makeHttpRequest(URL url, String bodyJSON, String method, String token) throws IOException {

        Request.Builder requestBuilder = createRequest(url, bodyJSON, method);
        if (!token.isEmpty()) {
            requestBuilder.addHeader("Authorization", "Bearer " + token);
        }
        Response response = okHttpClient.newCall(requestBuilder.build()).execute();
        return Objects.requireNonNull(response.body()).string();
    }

    private Request.Builder createRequest(URL url, String bodyJSON, String method) {
        Request.Builder requestBuilder = new Request.Builder().url(url);
        switch (method) {
            case "GET":
                requestBuilder.get();
                break;
            case "DELETE":
                requestBuilder.delete();
                break;
            default:
            case "POST":
                RequestBody body = RequestBody.create(JSON, bodyJSON);
                requestBuilder.post(body);
                break;
        }
        return requestBuilder;
    }

}

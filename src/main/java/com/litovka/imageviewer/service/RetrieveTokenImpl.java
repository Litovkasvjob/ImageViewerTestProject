package com.litovka.imageviewer.service;

import com.google.gson.Gson;
import com.litovka.imageviewer.model.AccessToken;
import com.litovka.imageviewer.service.requestform.AuthorizationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

@Service
public class RetrieveTokenImpl implements RetrieveToken{

    @Autowired
    private HttpService httpService;

    @Value("${apiKey}")
    private String apiKey;

    @Override
    public AccessToken getToken() throws IOException {

        String body = new Gson().toJson(AuthorizationModel.builder().apiKey(apiKey).build());

        String jsonToken = httpService.makeHttpRequest(new URL("http://interview.agileengine.com/auth"),
                body,
                "POST",
                "");
        return new Gson().fromJson(jsonToken, AccessToken.class);
    }

}

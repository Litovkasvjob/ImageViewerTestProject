package com.litovka.imageviewer.service;

import com.litovka.imageviewer.model.AccessToken;

import java.io.IOException;
import java.net.MalformedURLException;

public interface RetrieveToken {

    AccessToken getToken() throws IOException;
}

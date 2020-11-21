package com.litovka.imageviewer.service;

import com.google.gson.Gson;
import com.litovka.imageviewer.model.AccessToken;
import com.litovka.imageviewer.model.DetailedImage;
import com.litovka.imageviewer.model.Image;
import com.litovka.imageviewer.model.ImageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Service
public class ObtainImagesServiceImpl implements ObtainImagesService {

    @Autowired
    private HttpService httpService;

    @Override
    public List<Image> getImages(AccessToken token) throws IOException {

        String jsonResponse = httpService.makeHttpRequest(new URL("http://interview.agileengine.com/images"),
                null,
                "GET",
                token.getToken());


        ImageList images = new Gson().fromJson(jsonResponse, ImageList.class);

        return images.getPictures();
    }

    @Override
    public DetailedImage getImage(AccessToken token, String id) throws IOException {
        String jsonResponse = httpService.makeHttpRequest(new URL("http://interview.agileengine.com/images/" + id),
                null,
                "GET",
                token.getToken());

        DetailedImage image = new Gson().fromJson(jsonResponse, DetailedImage.class);

        return image;
    }


}

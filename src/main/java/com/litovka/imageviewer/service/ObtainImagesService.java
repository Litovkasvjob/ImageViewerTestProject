package com.litovka.imageviewer.service;

import com.litovka.imageviewer.model.AccessToken;
import com.litovka.imageviewer.model.DetailedImage;
import com.litovka.imageviewer.model.Image;

import java.io.IOException;
import java.util.List;

public interface ObtainImagesService {

    List<Image> getImages(AccessToken token) throws IOException;

    DetailedImage getImage(AccessToken token, String id) throws IOException;
}

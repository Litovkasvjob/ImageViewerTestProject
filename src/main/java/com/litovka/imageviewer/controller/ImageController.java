package com.litovka.imageviewer.controller;

import com.litovka.imageviewer.model.AccessToken;
import com.litovka.imageviewer.service.ObtainImagesService;
import com.litovka.imageviewer.service.RetrieveToken;
import com.litovka.imageviewer.view.DetailedImageView;
import com.litovka.imageviewer.view.ImageListView;
import com.litovka.imageviewer.view.ImageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.stream.Collectors;

@Controller
public class ImageController {

    @Autowired
    private ObtainImagesService obtainImagesService;

    @Autowired
    private RetrieveToken retrieveToken;

    @GetMapping(value = {"/"})
    public String viewImageList(Model model) throws IOException {

        AccessToken token = retrieveToken.getToken();
        model.addAttribute("token", token.getToken());

        return "authorization";
    }

    @GetMapping(value = {"/images"})
    public String getImages(@RequestParam("token") String token,  Model model) throws IOException {

        ImageListView imageListView = ImageListView.builder()
                .imageList(obtainImagesService.getImages(AccessToken.builder().token(token).build())
                        .stream()
                        .map(ImageView::of).collect(Collectors.toList()))
                .build();

        model.addAttribute("images", imageListView);
        model.addAttribute("token", token);


        return "imageList";
    }

    @GetMapping(value = {"/images/{id}"})
    public String getImage(@RequestParam("token") String token,
                            @PathVariable String id,
                            Model model) throws IOException {

        DetailedImageView image = DetailedImageView.of(obtainImagesService.getImage(AccessToken.builder().token(token).build(), id));

        model.addAttribute("image", image);


        return "detailedImage";
    }
}

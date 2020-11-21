package com.litovka.imageviewer.view;

import com.litovka.imageviewer.model.DetailedImage;
import com.litovka.imageviewer.model.Image;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DetailedImageView {

    private String id;
    private String author;
    private String camera;
    private String tags;
    private String croppedPicture;
    private String fullPicture;

    public static DetailedImageView of(DetailedImage image) {
        return DetailedImageView.builder()
                .id(image.getId())
                .author(image.getAuthor())
                .camera(image.getCamera())
                .tags(image.getTags())
                .croppedPicture(image.getCroppedPicture())
                .fullPicture(image.getFullPicture())
                .build();
    }
}

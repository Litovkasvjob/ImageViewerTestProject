package com.litovka.imageviewer.view;

import com.litovka.imageviewer.model.Image;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ImageView {

    private final String id;
    private final String croppedPicture;

    public static ImageView of(Image image) {
        return ImageView.builder()
                .id(image.getId())
                .croppedPicture(image.getCroppedPicture())
                .build();
    }

}

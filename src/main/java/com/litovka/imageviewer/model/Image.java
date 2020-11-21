package com.litovka.imageviewer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Image {

    private final String id;
    @SerializedName(value = "cropped_picture")
    private final String croppedPicture;

}

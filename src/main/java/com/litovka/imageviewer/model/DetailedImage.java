package com.litovka.imageviewer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DetailedImage {

    private String id;
    private String author;
    private String camera;
    private String tags;
    @SerializedName(value = "cropped_picture")
    private String croppedPicture;
    @SerializedName(value = "full_picture")
    private String fullPicture;
}

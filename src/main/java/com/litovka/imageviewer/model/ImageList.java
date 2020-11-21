package com.litovka.imageviewer.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class ImageList {

    private List<Image> pictures;
}

package com.litovka.imageviewer.view;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ImageListView {

    private List<ImageView> imageList;
}

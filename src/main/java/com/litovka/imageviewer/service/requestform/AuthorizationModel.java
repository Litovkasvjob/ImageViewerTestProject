package com.litovka.imageviewer.service.requestform;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthorizationModel {

    private String apiKey;
}

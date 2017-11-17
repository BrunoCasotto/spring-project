package com.spring.project.springproject.utils;

public enum BannerType {

    HTML_BANNER("html"), LIST_BANNER("list"), IMAGE_BANNER("image");

    private String value;

    BannerType(String value) {
        this.value = value;
    }
}

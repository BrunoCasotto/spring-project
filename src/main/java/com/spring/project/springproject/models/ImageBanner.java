package com.spring.project.springproject.models;

import jdk.nashorn.internal.objects.annotations.Getter;

public class ImageBanner extends Banner {
    private String imageUrl;
    private String imageLink;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Getter
    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}

package com.spring.project.springproject.models;
import java.util.ArrayList;

public class ListBanner extends Banner implements IBanner {
    private ArrayList<String> imagesUrl;
    private ArrayList<String> imagesLink;

    public ArrayList<String> getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(ArrayList<String> imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public ArrayList<String> getImagesLink() {
        return imagesLink;
    }

    public void setImagesLink(ArrayList<String> imagesLink) {
        this.imagesLink = imagesLink;
    }
}

package com.spring.project.springproject.models;

public class ImageBanner extends Banner {
    private String imageUrl;
    private String imageLink;

    public ImageBanner (String id, String webstoreId,
                        String type, String platform,
                        String imageUrl, String imageLink) {
        super.setId(id);
        super.setType(type);
        super.setWebstoreId(webstoreId);
        super.setPlatform(platform);
        this.imageUrl = imageUrl;
        this.imageLink = imageLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
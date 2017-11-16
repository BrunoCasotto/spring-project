package com.spring.project.springproject.models;

public class Banner {
    private String id;
    private String webstoreId;
    private String type;
    private String platform;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebstoreId() {
        return webstoreId;
    }

    public void setWebstoreId(String webstoreId) {
        this.webstoreId = webstoreId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

package com.spring.project.springproject.models;

public class HtmlBanner extends Banner implements IBanner {
    public String getHtmlValue() {
        return htmlValue;
    }

    public void setHtmlValue(String htmlValue) {
        this.htmlValue = htmlValue;
    }

    private String htmlValue;
}

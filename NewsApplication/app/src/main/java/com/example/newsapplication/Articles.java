package com.example.newsapplication;

public class Articles {

    private String title;
    private String decription;
    private String urlToImage;
    private String url;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Articles(String title, String decription, String urlToImage, String url, String content) {
        this.title = title;
        this.decription = decription;
        this.urlToImage = urlToImage;
        this.url = url;
        this.content = content;
    }
}

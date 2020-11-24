package com.yuksels.bihaber.model;

import java.util.Date;

public class NewsItem {
    int id;
    String title;
    String username;
    String newsImage;
    String userImage;
    String content;
    String bgColor;
    Date date;
    int viewType = 0; // 0 -> Only Text News 1 -> With Image  News 2 -> Video News
    String videoUrl;
    boolean isFav = false;

    public NewsItem() {
    }

    public NewsItem(int id, String title, String username, String newsImage, String userImage, String content, String bgColor, Date date, int viewType, String videoUrl, boolean isFav) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImage = newsImage;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.date = date;
        this.viewType = viewType;
        this.videoUrl = videoUrl;
        this.isFav = isFav;
    }

    public NewsItem(int id, String title, String username, String newsImage, String userImage, String content, String bgColor, Date date, int viewType) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImage = newsImage;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.date = date;
        this.viewType = viewType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @Override
    public String toString() {
        return "NewsModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", newsImage='" + newsImage + '\'' +
                ", userImage='" + userImage + '\'' +
                ", content='" + content + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", date=" + date +
                ", viewType=" + viewType +
                ", videoUrl='" + videoUrl + '\'' +
                ", isFav=" + isFav +
                '}';
    }
}

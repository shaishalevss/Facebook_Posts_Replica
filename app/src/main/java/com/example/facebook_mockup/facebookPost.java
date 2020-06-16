package com.example.facebook_mockup;

import android.widget.Button;

public class facebookPost {
    private int profilePicture;
    private String username;
    private String date;
    private String statusText;
    private int mainImage;
    private String likeRatio;

    //constructor with the big image
    public facebookPost(int profilePicture, String username, String date, String statusText, int mainImage, String likeRatio) {
        this.profilePicture = profilePicture;
        this.username = username;
        this.date = date;
        this.statusText = statusText;
        this.mainImage = mainImage;
        this.likeRatio = likeRatio;
    }

    //constructor without the big image
    public facebookPost(int profilePicture, String username, String date, String statusText, String likeRatio) {
        this.profilePicture = profilePicture;
        this.username = username;
        this.date = date;
        this.statusText = statusText;
        this.likeRatio = likeRatio;
    }

    //Getters & Setters

    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getLikeRatio() {
        return likeRatio;
    }

    public void setLikeRatio(String likeRatio) {
        this.likeRatio = likeRatio;
    }

}

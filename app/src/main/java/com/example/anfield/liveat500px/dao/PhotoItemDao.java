package com.example.anfield.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANFIELD on 24/4/2560.
 */

public class PhotoItemDao {
    //สร้างให้สัมพันกับข้อมูลใน json

    @SerializedName("id")               private int id;
    @SerializedName("link")             private String link;
    @SerializedName("image_url")        private String imageUrl;
    @SerializedName("caption")          private String caption;
    @SerializedName("user_id")          private int userId;
    @SerializedName("username")         private String uaername;
    @SerializedName("profile_picture")  private String profilePicture;
    @SerializedName("tags")             private List<String> tags = new ArrayList<>();
    @SerializedName("created_time")     private String createdTime;
    @SerializedName("camera")           private String camera;
    @SerializedName("lens")             private String lens;
    @SerializedName("focal_length")     private String focalLength;
    @SerializedName("iso")              private String iso;
    @SerializedName("shutter_speed")    private String shutterSpeed;
    @SerializedName("aperture")         private String aperture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUaername() {
        return uaername;
    }

    public void setUaername(String uaername) {
        this.uaername = uaername;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }
}

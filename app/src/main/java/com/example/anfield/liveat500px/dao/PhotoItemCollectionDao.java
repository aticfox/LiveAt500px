package com.example.anfield.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ANFIELD on 24/4/2560.
 */

public class PhotoItemCollectionDao {

    @SerializedName("succeess") private boolean success;
    @SerializedName("data")     private List<PhotoItemDao> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }
}

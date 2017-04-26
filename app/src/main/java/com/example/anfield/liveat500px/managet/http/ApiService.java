package com.example.anfield.liveat500px.managet.http;

import com.example.anfield.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by ANFIELD on 24/4/2560.
 */

public class ApiService {

    //ห้ามใส่ " / " ไม่งั้นใช้งานไม่ได้
    @POST("list")
    public Call<PhotoItemCollectionDao> loadPhotoList() {
        return null;
    }




}

package com.example.connectapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

    @GET("getPosts")
    Call<List<order>>getOrders();

    @POST("verify")
    Call<post> savePost(@Body post post);
}

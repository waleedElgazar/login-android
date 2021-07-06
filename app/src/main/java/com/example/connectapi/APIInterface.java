package com.example.connectapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("verify")
    Call<post> savePost(@Body post post);
}

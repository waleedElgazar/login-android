package com.example.connectapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="main" ;
    private final OkHttpClient client = new OkHttpClient();
    private APIInterface mAPIInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        post post=new post("01001200130","023817");
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://mandoop-auth-service.herokuapp.com/").
                addConverterFactory(GsonConverterFactory.create())
                .build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);
        Call<post>call= apiInterface.savePost(post);
        call.enqueue(new Callback<post>() {
            @Override
            public void onResponse(Call<post> call, Response<post> response) {
                System.out.println(response.body().getPhone());
            }

            @Override
            public void onFailure(Call<post> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

    }

}
package com.example.connectapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

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
    private ArrayList<order>data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //post
       /* post post=new post("01001200130","023817");
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://mandoop-auth-service.herokuapp.com/").
                addConverterFactory(GsonConverterFactory.create())
                .build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);
        Call<post>call= apiInterface.savePost(post);
        call.enqueue(new Callback<post>() {
            @Override
            public void onResponse(Call<post> call, Response<post> response) {
                System.out.println(response.body().toString());
            }
            @Override
            public void onFailure(Call<post> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });*/

        //get
        {
            data = new ArrayList<order>();
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://gp-mandoob-orders.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            APIInterface apiInterface = retrofit.create(APIInterface.class);
            Call<List<order>> call = apiInterface.getOrders();
            call.enqueue(new Callback<List<order>>() {
                @Override
                public void onResponse(Call<List<order>> call, Response<List<order>> response) {
                    System.out.println(response.body().toString());
                }

                @Override
                public void onFailure(Call<List<order>> call, Throwable t) {
                    System.out.println("Error " + t.getMessage());
                }
            });
        }

    }

}
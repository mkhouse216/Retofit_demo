package com.av.creditscore.retofit_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Retro_instace.CallMyapi().Postslist().enqueue(new Callback<List<Example>>() {
//            @Override
//            public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Example>> call, Throwable t) {
//
//            }
//        });
//
//        Retro_instace.CallMyapi().Almubslist().enqueue(new Callback<List<AlmubModel>>() {
//            @Override
//            public void onResponse(Call<List<AlmubModel>> call, Response<List<AlmubModel>> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<List<AlmubModel>> call, Throwable t) {
//
//            }
//        });


        Retro_instace.CallMyapi().Userlogin("dixitpatel1134@gmail.com","1234").enqueue(new Callback<UserdLogin>() {
            @Override
            public void onResponse(Call<UserdLogin> call, Response<UserdLogin> response) {

                Log.e("=====", "onResponse: "+response.body() );

                Toast.makeText(MainActivity.this, "="+response.body().getConnection(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "=="+response.body().getResult(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "=="+response.body().getUserData(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<UserdLogin> call, Throwable t) {
                Toast.makeText(MainActivity.this, "onFailure" ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
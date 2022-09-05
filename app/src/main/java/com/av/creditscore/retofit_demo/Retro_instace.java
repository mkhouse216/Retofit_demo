package com.av.creditscore.retofit_demo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_instace {



    public  static  GithubService  CallMyapi()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://quakier-multitask.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GithubService service = retrofit.create(GithubService.class);
        return  service;
    }
}

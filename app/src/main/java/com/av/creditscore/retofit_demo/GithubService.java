package com.av.creditscore.retofit_demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GithubService {


    @GET("posts")
    Call<List<Example>> Postslist();

    @GET("albums")
    Call<List<AlmubModel>> Almubslist();

    @FormUrlEncoded
    @POST("ApiCalling/login.php")
    Call<UserdLogin> Userlogin(@Field("email") String s,@Field("password") String s1);

}

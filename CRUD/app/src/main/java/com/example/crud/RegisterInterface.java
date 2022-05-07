package com.example.crud;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterInterface {

    String REGIURL = "http://192.168.1.47/login/";
    @FormUrlEncoded
    @POST("register.php")
    Call<String> getUserRegi(
            @Field("name") String name,
            @Field("hobby") String hobby,
            @Field("password") String password
    );

}

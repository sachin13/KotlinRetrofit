package com.example.kotlinretrofit

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("get_data.php")
    fun createUser(
        @Field("name") name:String,
        @Field("email") email:String

    ): Call<DefaultResponse>

    /*@FormUrlEncoded
    @POST("userlogin")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>*/
}
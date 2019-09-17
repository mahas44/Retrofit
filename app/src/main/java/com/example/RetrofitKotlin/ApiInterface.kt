package com.example.RetrofitKotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

//    @GET("movie/{id}")
//    fun getAllPlaylist(@Path("id") id:Int, @Query("api_key") apiKey:String):Call<Data>

    @GET("movie/popular")
    fun getAllPlaylist(@Query("api_key") apiKey:String):Call<Data>
}
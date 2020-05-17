package com.example.retrofitkotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("movie/popular")
    fun getAllPlaylist(@Query("api_key") apiKey:String):Call<Data>
}

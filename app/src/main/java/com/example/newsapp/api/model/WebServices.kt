package com.example.newsapp.api.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WebServices {
    //https://newsapi.org (Base URL that call the server)
    @GET("v2/top-headlines/sources")
    fun getSources(@Query("apikey")apiKey:String ) :Call<SourcesResponse>
    //function take query para. called api type string and return the objects after parsing by GSON
}

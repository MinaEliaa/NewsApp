package com.example.newsapp.api.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager { //have the object of retrofit
    companion object {
        private var retrofit : Retrofit?=null
       //Synchronized function used only one time
         @Synchronized fun getInstance():Retrofit {
            if (retrofit==null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://newsapi.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
             }
            return retrofit!!
        }

        fun getApis() :WebServices{
            return getInstance().create(WebServices::class.java)
        }
        //var service: WebServices = retrofit!!.create(WebServices::class.java)
    }
}
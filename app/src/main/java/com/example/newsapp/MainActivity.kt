package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapp.api.model.ApiManager
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val apiKey ="659f2e3cebad45a89e486f9cac5533e8"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiManager
            .getApis()
            .getSources(apiKey)
            .enqueue(object : retrofit2.Callback<SourcesResponse> {
                override fun onResponse(
                    call: Call<SourcesResponse>,
                    response: Response<SourcesResponse>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<SourcesResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }


            })
    }
}
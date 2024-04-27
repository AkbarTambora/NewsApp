package com.example.newsapp.data.remote.retrofit

import com.example.newsapp.data.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //@GET("top-headlines?country=id&category=science")
    @GET("everything?q=tesla")
    suspend fun getNews(@Query("apiKey") apiKey: String): NewsResponse
}
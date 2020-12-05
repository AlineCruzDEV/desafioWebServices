package com.digitalhouse.marvelhqs.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import com.google.gson.JsonObject

interface Service{

    @GET("characters/1009610/comics")
    suspend fun getHQsMiranha(
        @Query("limit") lim: Int,
        @Query("offset") offset: Int,
        @Query("ts") ts: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ) : JsonObject

}

val retrofit = Retrofit.Builder()
    .baseUrl("https://gateway.marvel.com/v1/public/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service: Service = retrofit.create(Service::class.java)
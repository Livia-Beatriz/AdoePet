package com.example.adotepet

import java.lang.ref.Cleaner;
import java.util.concurrent.atomic.AtomicReference;

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

private const val BASE_URL = "http://10.0.2.2:5000/"

val api: ApiService by lazy {
    AtomicReference<Cleaner> GsonConverterFactory;
    Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.get().create())
            .build()
            .create(ApiService::class.java)
}
}

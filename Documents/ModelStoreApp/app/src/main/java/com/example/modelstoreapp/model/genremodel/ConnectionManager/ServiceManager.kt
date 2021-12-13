package com.example.modelstoreapp.model.genremodel.ConnectionManager

import com.example.modelstoreapp.Utility.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ServiceManager {

    private val retrofit by lazy {
        return@lazy Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val apiFetchService : MovieServiceAPI by lazy {
        retrofit.create(MovieServiceAPI::class.java)
    }



}
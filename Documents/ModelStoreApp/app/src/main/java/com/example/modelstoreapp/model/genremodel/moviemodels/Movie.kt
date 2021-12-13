package com.example.modelstoreapp.model.genremodel.moviemodels

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movie(
    @Json(name="id") val movie_id:Int,
    @Json(name="name") val movie_name:String
)

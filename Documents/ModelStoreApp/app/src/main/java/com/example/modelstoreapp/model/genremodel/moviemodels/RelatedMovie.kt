package com.example.modelstoreapp.model.genremodel.moviemodels

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelatedMovie(
    @Json(name="title") val movie_Title:String,
    @Json(name="poster_path") val movie_poster:String,
)

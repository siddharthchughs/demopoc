package com.example.modelstoreapp.model.genremodel.moviemodels

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieModel(
    @Json(name = "id") val generid : String,
    @Json(name = "results") val movieList : List<Movie>
)

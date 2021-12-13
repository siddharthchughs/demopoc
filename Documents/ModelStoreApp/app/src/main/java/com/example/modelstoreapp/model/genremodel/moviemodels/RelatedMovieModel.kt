package com.example.modelstoreapp.model.genremodel.moviemodels

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RelatedMovieModel(
    @Json(name="results") val results: List<RelatedMovie>
)

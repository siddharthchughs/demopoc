package com.example.modelstoreapp.model.genremodel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenreModel(
    @Json(name="genres") val genresList : List<Genre>
)

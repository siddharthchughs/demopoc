package com.example.modelstoreapp.model.genremodel.ConnectionManager

import com.example.modelstoreapp.Utility.GENRE_URL
import com.example.modelstoreapp.Utility.MOVIE_URL
import com.example.modelstoreapp.model.genremodel.GenreModel
import com.example.modelstoreapp.model.genremodel.moviemodels.MovieModel
import com.example.modelstoreapp.model.genremodel.moviemodels.RelatedMovieModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieServiceAPI {

    @GET(GENRE_URL)
    suspend fun getGenreOfMovies(
        @Query("api_key") apiKey: String): Response<GenreModel>

    @GET(MOVIE_URL+"/{movieid}/lists")
    suspend fun getMoviesListByID(
        @Path("movieid") grid:String,
        @Query("api_key") apiKey: String
       ): Response<MovieModel>?

    @GET(MOVIE_URL+"/{movieid}/similar")
    suspend fun getSimilarMoviesListByID(
        @Path("movieid") grid:Int,
        @Query("api_key") apiKey: String
       ): Response<RelatedMovieModel>?

}
package com.example.modelstoreapp.Utility

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.modelstoreapp.R


const val BASE_URL = "https://api.themoviedb.org/3/"
const val GENRE_URL = BASE_URL+"genre/movie/list"
const val MOVIE_URL = BASE_URL+"movie"
const val api_key = "f60ae473c8d03fdd88e75848cea96a8e"

fun getProgressDrawable(context: Context): CircularProgressDrawable{
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10F
        centerRadius = 50F
        start()
    }
}


fun ImageView.loadImage(uris: String?, progressDrawable: CircularProgressDrawable){
    val options = RequestOptions.placeholderOf(progressDrawable)
        .error(R.drawable.ic_launcher_background)
    Glide.with(this.context)
        .setDefaultRequestOptions(options)
        .load(uris)
        .into(this)
}
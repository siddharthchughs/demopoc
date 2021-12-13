package com.example.modelstoreapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.modelstoreapp.model.genremodel.GenreRepository
import com.example.modelstoreapp.model.genremodel.MovieRepository
import com.example.modelstoreapp.model.genremodel.repo.RelatedMovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DetailViewModel(app:Application) : AndroidViewModel(app) {

    val similarMoviesRepo = RelatedMovieRepository(app)

    private lateinit var job :Job
    val getMovieByGnr = similarMoviesRepo.relatedGenreMutableMovieList


    fun showSimilarMByG(genreID:Int) {
      job =  viewModelScope.launch(Dispatchers.IO) {
            similarMoviesRepo.showSimilarMovieForGenre(genreID)
        }
    }

    fun stopFetch(){
        try {
            job.cancel()
        }catch (ignore:UninitializedPropertyAccessException){

        }
    }
}

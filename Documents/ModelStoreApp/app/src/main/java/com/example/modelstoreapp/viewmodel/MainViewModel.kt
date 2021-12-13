package com.example.modelstoreapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.modelstoreapp.model.genremodel.Genre
import com.example.modelstoreapp.model.genremodel.GenreRepository
import com.example.modelstoreapp.model.genremodel.MovieRepository
import com.example.modelstoreapp.model.genremodel.moviemodels.Movie
import com.example.modelstoreapp.model.genremodel.moviemodels.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(app:Application) : AndroidViewModel(app) {

    val genreRepo = GenreRepository(app)
    val mbygenreRepo = MovieRepository(app)

    val getGenreData = genreRepo.genreMutableList
    val getMovieByGnr = mbygenreRepo.moviegrnMutableList

    val genreSharing = MutableLiveData<Genre>()
//    val movieSharing = MutableLiveData<MovieModel>()

    fun showMByG(genreid:String) {
        viewModelScope.launch(Dispatchers.IO) {
            mbygenreRepo.showMovieForGenre(genreid)
        }
    }

}

package com.example.modelstoreapp.model.genremodel

import android.app.Application
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.telecom.ConnectionService
import android.util.Log
import androidx.annotation.WorkerThread
import androidx.lifecycle.MutableLiveData
import com.example.modelstoreapp.Utility.BASE_URL
import com.example.modelstoreapp.Utility.api_key
import com.example.modelstoreapp.model.genremodel.ConnectionManager.MovieServiceAPI
import com.example.modelstoreapp.model.genremodel.moviemodels.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class GenreRepository(val app: Application) {

    var genreMutableList  = MutableLiveData<List<Genre>>()
    var moviegrnMutableList  = MutableLiveData<List<Movie>>()
    lateinit var genre_id: String

    init {
        CoroutineScope(Dispatchers.IO).launch {
            showGenreMovie()
            delay(500)
        }
    }


    @WorkerThread
    suspend fun showGenreMovie(){
        if(networkConnection()){
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            val service = retrofit.create(MovieServiceAPI::class.java)
            val serviceData = service.getGenreOfMovies(api_key).body()?.genresList?: emptyList()
            genreMutableList.postValue(serviceData)
            Log.i("the","Data"+ serviceData)
        }
    }


/*
    @WorkerThread
   suspend fun showMovieForGenre(grnId:String){
       if(networkConnection()){
           val retrofit = Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(MoshiConverterFactory.create())
               .build()
           val service = retrofit.create(MovieServiceAPI::class.java)
           val movieByGenre = service.getMoviesListByID(grnId,api_key)?.body()?.movieList?: emptyList()
           moviegrnMutableList.postValue(movieByGenre)
           Log.i("TAG","MBYG"+ movieByGenre.toString())

       }
    }
*/


    fun networkConnection(): Boolean{
        val connectionManager = app.getSystemService(ConnectionService.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfoCheck = connectionManager.activeNetworkInfo
        val connectionServiceBy = connectionManager.getNetworkCapabilities(connectionManager.activeNetwork)
        if(connectionServiceBy!=null){
            if(connectionServiceBy.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)){
                return true
            } else if(connectionServiceBy.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)){
                return true
            }
        }
        return networkInfoCheck?.isConnectedOrConnecting?:false
    }

}
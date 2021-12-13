package com.example.modelstoreapp.model.genremodel.repo

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
import com.example.modelstoreapp.model.genremodel.moviemodels.RelatedMovie
import com.example.modelstoreapp.model.genremodel.moviemodels.RelatedMovieModel
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RelatedMovieRepository(val app: Application){

    var  relatedGenreMutableMovieList = MutableLiveData<RelatedMovieModel>()


    @WorkerThread
    suspend fun showSimilarMovieForGenre(grnId:Int){
        if(networkConnection()){
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            val service = retrofit.create(MovieServiceAPI::class.java)
            val similarMovieByGenre = service.getSimilarMoviesListByID(grnId, api_key)?.body()
            relatedGenreMutableMovieList.postValue(similarMovieByGenre)
            Log.i("TAG","SMBYG"+ similarMovieByGenre.toString())

        }
    }


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

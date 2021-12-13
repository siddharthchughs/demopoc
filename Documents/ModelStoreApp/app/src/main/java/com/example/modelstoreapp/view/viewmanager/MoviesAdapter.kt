/*
package com.example.modelstoreapp.view.viewmanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modelstoreapp.R
import com.example.modelstoreapp.model.genremodel.moviemodels.Movie
import com.example.modelstoreapp.model.genremodel.moviemodels.MovieModel
import kotlinx.android.synthetic.main.item_moviebygenre.view.*

class MoviesAdapter(val itemListener: onMovieSelectItem) : RecyclerView.Adapter<MoviesAdapter.MyCountryHolder>() {

    private val countryArrayList= ArrayList<Movie>()

    fun showItems(country: MovieModel){
        countryArrayList.clear()
        country.movieList.let { countryArrayList.addAll(it) }
        notifyDataSetChanged()
    }

    override fun getItemCount() = countryArrayList.size

    inner class MyCountryHolder(view: View) : RecyclerView.ViewHolder(view){
        private val countryName = view.tv_MovieTitle

        fun bind(country: Movie){
            countryName.text = country.movie_name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCountryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflateLayoutView = layoutInflater.inflate(R.layout.item_moviebygenre,parent,false)
        return MyCountryHolder(inflateLayoutView)
    }

    override fun onBindViewHolder(holder: MyCountryHolder, position: Int) {
        holder.bind(countryArrayList[position])
        holder.itemView.setOnClickListener {
            itemListener.onMovieSelectClickEvent(countryArrayList[position])
        }
    }

    interface onMovieSelectItem{
        fun onMovieSelectClickEvent(movie:Movie)
    }
}*/

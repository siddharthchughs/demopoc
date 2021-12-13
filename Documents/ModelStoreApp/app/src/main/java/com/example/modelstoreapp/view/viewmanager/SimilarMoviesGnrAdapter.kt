package com.example.modelstoreapp.view.viewmanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.modelstoreapp.R
import com.example.modelstoreapp.Utility.getProgressDrawable
import com.example.modelstoreapp.Utility.loadImage
import com.example.modelstoreapp.model.genremodel.Genre
import com.example.modelstoreapp.model.genremodel.moviemodels.RelatedMovie
import com.example.modelstoreapp.model.genremodel.moviemodels.RelatedMovieModel
import kotlinx.android.synthetic.main.item_moviebygenre.view.tv_MovieTitle
import kotlinx.android.synthetic.main.item_similarmoviebygenre.view.*

class SimilarMoviesGnrAdapter() : RecyclerView.Adapter<SimilarMoviesGnrAdapter.MyCountryHolder>() {

    private val countryArrayList= ArrayList<RelatedMovie>()

    fun showSimilarItems(country: RelatedMovieModel){
        countryArrayList.clear()
        country.results.let { countryArrayList.addAll(it) }
        notifyDataSetChanged()
    }

    inner class MyCountryHolder(view: View) : RecyclerView.ViewHolder(view){
        private val countryName = view.tv_MovieTitle
        private val imageMovie = view.img_MoviePoster
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(country: RelatedMovie){
            countryName.text = country.movie_Title
            imageMovie.loadImage(country.movie_poster,progressDrawable)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCountryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflateLayoutView = layoutInflater.inflate(R.layout.item_similarmoviebygenre,parent,false)
        return MyCountryHolder(inflateLayoutView)
    }

    override fun onBindViewHolder(holder: MyCountryHolder, position: Int) {
        holder.bind(countryArrayList[position])
    }

    override fun getItemCount() = countryArrayList.size

}
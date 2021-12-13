package com.example.modelstoreapp.view.viewmanager

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.modelstoreapp.R
import com.example.modelstoreapp.model.genremodel.Genre
import com.example.modelstoreapp.model.genremodel.GenreModel
import com.example.modelstoreapp.model.genremodel.moviemodels.Movie
import com.example.modelstoreapp.model.genremodel.moviemodels.MovieModel
import kotlinx.android.synthetic.main.item_moviebygenre.view.*

class GenreAdapter(val itemListener: onMovieSelectItem) : RecyclerView.Adapter<GenreAdapter.MyCountryHolder>() {

    private val genreArrayList= ArrayList<Genre>()
    private var selectItemPosition = -1

    fun showGenreItems(country: List<Genre>){
        genreArrayList.clear()
        genreArrayList.addAll(country)
        notifyDataSetChanged()
    }

    override fun getItemCount() = genreArrayList.size

    inner class MyCountryHolder(view: View) : RecyclerView.ViewHolder(view){
        private val countryName = view.tv_MovieTitle
        fun bind(country: Genre){
            countryName.text = country.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCountryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflateLayoutView = layoutInflater.inflate(R.layout.item_moviebygenre,parent,false)
        return MyCountryHolder(inflateLayoutView)
    }

    override fun onBindViewHolder(holder: MyCountryHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.bind(genreArrayList[position])
        holder.itemView.tag = genreArrayList[position]
        holder.itemView.setOnClickListener {
            itemListener.onMovieSelectClickEvent(position, genreArrayList[position])
              selectItemPosition = position
              notifyDataSetChanged()
        }
        if(selectItemPosition == position){
           holder.itemView.setBackgroundColor(Color.parseColor("#0077c2"))
        }
        else
        {
            holder.itemView.setBackgroundColor(Color.parseColor("#42a5f5"))
        }
    }

    interface onMovieSelectItem{
        fun onMovieSelectClickEvent(position: Int,movie:Genre)
    }
}
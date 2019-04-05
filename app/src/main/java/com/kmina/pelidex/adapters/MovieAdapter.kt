package com.kmina.pelidex.adapters

import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.kmina.pelidex.R
import com.kmina.pelidex.model.Movie
import kotlinx.android.synthetic.main.cardview_movie.view.*

class MovieAdapter(var movies:List<Movie>):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_movie,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) = holder.bind(movies[position])

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bin(movie:Movie) = with(itemView){
            Glide.with(itemView.context)
                .load(movie.Poster)
                .placeholder(R.drawable.ic_launcher_background)
                .into(movie_image_cv)

            movie_title_cv.text = movie.Title
            movie_plot_cv.text = movie.Plot
            movie_rate_cv.text = movie.imbdRating
            movie_runtime_cv.text = movie.Runtime
        }
    }
}
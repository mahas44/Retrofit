package com.example.RetrofitKotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.single_line_list.view.*

class RecylerAdapter(resultPopular: List<Data.Results>?) : RecyclerView.Adapter<RecylerAdapter.ListViewHolder>() {

    var list = resultPopular

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        var inflater = LayoutInflater.from(parent?.context)
        var tekSatirList = inflater.inflate(R.layout.single_line_list, parent, false)

        return ListViewHolder(tekSatirList)

    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var createdLine = list?.get(position)
        holder.setData(createdLine)
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var singleLineList = itemView as CardView

        var title = singleLineList.tvTitle
        var poster = singleLineList.imgPoster
        var date = singleLineList.tvDate

        fun setData(itemView: Data.Results?){
            title.text = itemView?.original_title
            Picasso.get().load("https://image.tmdb.org/t/p/w200/"+itemView?.poster_path).into(poster)
            date.text = itemView?.release_date
        }

    }

}



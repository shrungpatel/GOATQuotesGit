package com.example.goatquotes_12_18.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.goatquotes_12_18.R
import com.example.goatquotes_12_18.data.ListAdapter.ViewHolder
import com.example.goatquotes_12_18.model.Quote

class ListAdapter(private val list: ArrayList<Quote>, private val context: Context): RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(quoteText: Quote) {
            var quote: TextView = itemView.findViewById(R.id.quoteTextInCard) as TextView
            quote.text= quoteText.quote
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
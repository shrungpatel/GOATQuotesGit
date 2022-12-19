package com.example.goatquotes_12_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.goatquotes_12_18.data.ListAdapter
import com.example.goatquotes_12_18.model.Quote
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.savedQuotesBtn

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        savedQuotesBtn.setOnClickListener() {
            startActivity(Intent(this, Saved::class.java))
        }
        var adapter: ListAdapter?= null
        var quoteList:ArrayList<Quote>?= null
        var layoutManager:RecyclerView.LayoutManager?= null
        quoteList=ArrayList<Quote>()
        layoutManager= LinearLayoutManager(this)
        adapter=ListAdapter(quoteList, this)

        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter

        val quoteTextList: Array<String> = arrayOf("You can do this!", "Do not give up.", "Try again and again", "JUst this close, do not stop now!", "Ask yourself 'Who am I?'", "Fight for it", "Make your mark", "Last quote")
        for(i in 0..quoteTextList.size - 1) {
            val currentQuote = Quote()
            currentQuote.quote = quoteTextList[i]
            quoteList.add(currentQuote)
        }
        adapter.notifyDataSetChanged()
    }
}
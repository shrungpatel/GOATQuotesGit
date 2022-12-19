package com.example.goatquotes_12_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedQuotesBtn.setOnClickListener() {
            startActivity(Intent(this, Saved::class.java))
        }
        dashboardBtn.setOnClickListener() {
            startActivity(Intent(this, Dashboard::class.java))
        }

    }
}
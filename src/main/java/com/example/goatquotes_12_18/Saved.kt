package com.example.goatquotes_12_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.dashboardBtn
import kotlinx.android.synthetic.main.activity_saved.*
import kotlinx.android.synthetic.main.card_layout.*

class Saved : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)
        dashboardBtn.setOnClickListener() {
            startActivity(Intent(this, Dashboard::class.java))
        }
    }
}
package com.example.jusmeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeThree : AppCompatActivity() {
    lateinit var btnmemethree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        btnmemethree = findViewById(R. id.btn_three)
        btnmemethree.setOnClickListener {
            val intent = Intent(this, MemeFour::class.java)
            startActivity(intent)
        }
    }
}
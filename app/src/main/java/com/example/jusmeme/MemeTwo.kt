package com.example.jusmeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeTwo : AppCompatActivity() {
    lateinit var Btnmemetwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        Btnmemetwo = findViewById(R.id.btnmemetwo)
        Btnmemetwo.setOnClickListener {
            val intent = Intent(this,MemeThree::class.java)
            startActivity(intent)
        }
    }
}
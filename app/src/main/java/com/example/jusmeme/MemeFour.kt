package com.example.jusmeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeFour : AppCompatActivity() {
    lateinit var btnmemefour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_four)
        btnmemefour = findViewById(R.id.btn_four)
        btnmemefour.setOnClickListener {
            val intent = Intent(this, MemeFive::class.java)
            startActivity(intent)
        }
    }
}
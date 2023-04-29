package com.example.jusmeme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnOne : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne = findViewById(R. id.btn_one)
        btnOne.setOnClickListener {
            val intent = Intent(this, MemeTwo::class.java)
            startActivity(intent)
        }

    }
}
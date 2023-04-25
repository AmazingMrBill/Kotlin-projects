package com.example.foziacv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnResume = findViewById<Button>(R.id.btnresume)

        btnResume.setOnClickListener() {
            val intent = Intent(this, Resume::class.java)
            startActivity(intent)
        }


    }
}
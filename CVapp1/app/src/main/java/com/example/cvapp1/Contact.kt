package com.example.cvapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnresume = findViewById<Button>(R.id.resume)

        btnresume.setOnClickListener() {
            val intent = Intent(this, resume::class.java)
            startActivity(intent)
        }

        val btnAbout = findViewById<Button>(R.id.about)

        btnAbout.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
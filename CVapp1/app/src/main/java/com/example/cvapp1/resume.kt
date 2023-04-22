package com.example.cvapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        val btnAbout = findViewById<Button>(R.id.about)

        btnAbout.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnContact = findViewById<Button>(R.id.contact)

        btnContact.setOnClickListener() {
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }



    }
}
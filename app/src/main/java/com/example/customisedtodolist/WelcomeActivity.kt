package com.example.customisedtodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val nextButton:Button=findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            startActivity(Intent(this,QuoteOfTheDay::class.java))
        }
    }
}
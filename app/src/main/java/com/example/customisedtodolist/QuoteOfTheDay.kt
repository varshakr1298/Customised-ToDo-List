package com.example.customisedtodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuoteOfTheDay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote_of_the_day)
        val quoteButton:Button=findViewById(R.id.quote_button)
        val nextButton1:Button=findViewById(R.id.next_button1)
        quoteButton.setOnClickListener {
            setQuote()
        }
        nextButton1.setOnClickListener {
            startActivity(Intent(this,Colors::class.java))
        }
    }
    private fun setQuote(){
        var randomQuote:TextView=findViewById(R.id.quote_text)
        val randomInt=(1..7).random()
        val quote=when(randomInt){
            1->"Your sacred space is where you can find yourself again and again.\n ~ Joseph Campbell"
            2->"The Experience of Sacred Space makes possible the founding of the world: where the sacred Manifests itself in space, the real unveils itself, the world comes into existence.\n ~ Mircea Eliade"
            3->"Gratitude is a sacred space where you allow and know that a force greater than your ego is always at work and always available.\n ~ Wayne Dyer"
            4->"The goal of life is to make your heartbeat match the beat of the universe, to match your nature with Nature.\n ~ Joseph Campbell"
            5->"Each place is the right place--the place where I now am can be a sacred space.\n Ravi Ravindra"
            6->"Breathing is meditation; life is a meditation. You have to breathe in order to live, so breathing is how you get in touch with the sacred space of your heart.\n ~ Willow Smith"
            7->"Dream it. Wish it. Do it."
            else->" Great things never come from comfort zones."
        }
        randomQuote.setText(quote)
    }
}
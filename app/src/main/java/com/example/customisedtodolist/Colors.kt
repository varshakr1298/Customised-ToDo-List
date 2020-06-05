package com.example.customisedtodolist

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_colors.*

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)
        setListeners()
        val nextButton2:Button=findViewById(R.id.next_button2)
        nextButton2.setOnClickListener {
            startActivity(Intent(this,Todo::class.java))
        }
    }
    private fun makeViewable(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> {box_one_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.exciting)
            }
            R.id.box_two_text -> {box_two_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.friendly)
            }
            R.id.box_three_text -> {box_three_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.optimistic)
            }
            R.id.box_four_text -> {box_four_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.peace)
            }
            R.id.box_five_text -> {box_five_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.dependable)
            }
            R.id.box_six_text->{box_six_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.creative)
            }
            R.id.box_seven_text->{box_seven_text.setTextColor(Color.WHITE)
                var image=findViewById<ImageView>(R.id.image1)
                image.setImageResource(R.drawable.calm)
            }
            else -> Toast.makeText(this,"No color selected",Toast.LENGTH_SHORT)
        }

    }
    private fun setListeners() {


        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,boxSixText,boxSevenText)
        for (item in clickableViews) {
            item.setOnClickListener { makeViewable(it) }
        }
}
}
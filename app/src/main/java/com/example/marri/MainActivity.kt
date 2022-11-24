package com.example.marri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickbutton = findViewById<TextView>(R.id.batton)
        val numberbutton = findViewById<TextView>(R.id.zero)
        val menubatton = findViewById<ImageView>(R.id.menu)

        clickbutton.setOnClickListener{
            var number = numberbutton.text.toString().toInt()
             number++
            numberbutton.text = number.toString()
        }
       menubatton.setOnClickListener{
           Toast.makeText(this, "congrats", Toast.LENGTH_SHORT).show()
       }
    }
}

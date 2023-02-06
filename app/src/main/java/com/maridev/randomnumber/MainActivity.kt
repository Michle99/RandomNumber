package com.maridev.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumberButton: Button = findViewById(R.id.random_number_button)

        randomNumberButton.setOnClickListener {
            generateRandomNumber()
        }


    }

    private fun generateRandomNumber() {
        val randomNumberText: TextView = findViewById(R.id.random_number_text)

        val randomNumber = (1..10).random()

        randomNumberText.text = randomNumber.toString()
    }
}
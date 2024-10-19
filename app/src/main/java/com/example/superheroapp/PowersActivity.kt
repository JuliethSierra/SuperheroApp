package com.example.superheroapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PowersActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_powers)

        val powersList = intent.getStringArrayExtra("POWERS_LIST") ?: emptyArray()

        val powersTextView = findViewById<TextView>(R.id.powersTextView)
        powersTextView.text = powersList.joinToString(separator = "\n")
    }
}
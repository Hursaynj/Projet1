package com.example.firstproject

import android.graphics.Color
import android.os.Bundle
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Projet2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projet2)

        val entête = findViewById<TextView>(R.id.entête)
        val buttonEnter = findViewById<Button>(R.id.bouton)
        val messageText = findViewById<TextView>(R.id.textView3)

        entête.setTextColor(Color.BLACK)
        buttonEnter.setOnClickListener{
            messageText.setText("Vous avez cliquez sur le button")
        }

    }
}
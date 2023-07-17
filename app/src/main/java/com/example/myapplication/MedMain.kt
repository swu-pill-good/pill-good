package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MedMain : AppCompatActivity() {
    lateinit var rec_button : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_med_main)

        rec_button=findViewById<Button>(R.id.rec)

        rec_button.setOnClickListener {
            var intent = Intent(this, MedRec::class.java)
            startActivity(intent)
        }
    }
}
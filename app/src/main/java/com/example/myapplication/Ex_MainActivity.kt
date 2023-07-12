package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Ex_MainActivity : AppCompatActivity() {
    lateinit var main_QR_button: ImageView
    lateinit var main_list_button: ImageView
    lateinit var main_my_button: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_main)
        main_QR_button=findViewById(R.id.main_QR_button)
        main_list_button=findViewById(R.id.main_list_button)
        main_my_button=findViewById(R.id.main_my_button)

        main_QR_button.setOnClickListener {
            var intent= Intent(this,QR::class.java)
            startActivity(intent)
        }
        main_list_button.setOnClickListener {
            var intent= Intent(this,MedMain::class.java)
            startActivity(intent)
        }
        main_my_button.setOnClickListener {
            var intent= Intent(this,MyPage::class.java)
            startActivity(intent)
        }
    }
}
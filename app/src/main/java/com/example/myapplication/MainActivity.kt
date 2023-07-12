package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

/*import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme*/

class MainActivity : ComponentActivity() {
    lateinit var main_QR_button:ImageView
    lateinit var main_my_button:ImageView
    lateinit var main_list_button:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_QR_button=findViewById(R.id.main_QR_button)
        main_my_button=findViewById(R.id.main_my_button)
        main_list_button=findViewById(R.id.main_my_button)

        main_QR_button.setOnClickListener {
            val intent= Intent(this,QR::class.java)
            startActivity(intent)
        }
        main_my_button.setOnClickListener {
            val intent= Intent(this,settings::class.java)
            startActivity(intent)
        }
        main_list_button.setOnClickListener {
            val intent= Intent(this,MedMain::class.java)
            startActivity(intent)
        }


    }
}
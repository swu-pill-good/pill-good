package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Button

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
   // lateinit var chat_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //chat_button = findViewById<Button>(R.id.main_chatbot_button)

        //chat_button.setOnClickListener {
        //    val intent = Intent(this, ChatBot::class.java)
        //    startActivity(intent)
       // }
    }
}
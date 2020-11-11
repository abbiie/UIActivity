package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.SetBtn).setOnClickListener{SetUp()}
        findViewById<Button>(R.id.ExitBtn).setOnClickListener{Exit()}
    }

        private fun SetUp() {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        private fun Exit(){
            finish()
        }
}
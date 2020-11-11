package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        findViewById<Button>(R.id.MBtn).setOnClickListener{MainMenu()}

        val txt = findViewById<TextView>(R.id.Information)
        val output = intent.getStringExtra("output")
        txt.text = output
    }
    private fun MainMenu(){
        val main = Intent(this, MainActivity::class.java)
        startActivity(main)
    }
}
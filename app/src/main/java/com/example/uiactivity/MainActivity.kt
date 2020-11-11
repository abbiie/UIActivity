package com.example.uiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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
            finishAffinity(); // Close all activites
            System.exit(0);
//                finish();
            }
        }

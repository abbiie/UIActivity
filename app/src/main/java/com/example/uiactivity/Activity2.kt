package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        findViewById<Button>(R.id.NextBtn).setOnClickListener{Next()}
        findViewById<Button>(R.id.BackBtn).setOnClickListener{Back()}

        val pnumber = findViewById<EditText>(R.id.Pnum)
        pnumber.setVisibility(View.INVISIBLE)
        val switch = findViewById<Switch>(R.id.Phone)
        switch.setOnClickListener {
            if(findViewById<Switch>(R.id.Phone).isChecked){
                pnumber.setVisibility(View.VISIBLE)
            }else{
                pnumber.setVisibility(View.INVISIBLE)
            }
        }

    }

    private fun Next() {
        val next = Intent(this, Activity3::class.java)
        val fname = findViewById<EditText>(R.id.FNameBtn).text.toString()
        val lname = findViewById<EditText>(R.id.LNameBtn).text.toString()
        val email = findViewById<EditText>(R.id.editText).text.toString()
        val phone = findViewById<EditText>(R.id.Pnum).text.toString()
        next.putExtra("first name", fname)
        next.putExtra("last name", lname)
        next.putExtra("email", email)
        next.putExtra("Phone Number", phone)
        startActivity(next)
    }
    private fun Back(){
       onBackPressed()
    }


        }

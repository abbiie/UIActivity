package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        findViewById<Button>(R.id.nexttBtn).setOnClickListener { Nextt() }
        findViewById<Button>(R.id.backkBtn).setOnClickListener { Backk() }

        val calendar = findViewById<CalendarView>(R.id.calendarView)
        val calendarvalue = findViewById<TextView>(R.id.bdate)
        calendar.setDate(973859619000, false, true)
        calendar.setOnDateChangeListener { calendarView, i, i2, i3 ->
            val month = "$i2"
            val convertmonthtoint = month.toInt()
            val addmonthplus1 = convertmonthtoint + 1;
            calendarvalue.text = ("$i3/$addmonthplus1/$i").toString()
        }
    }

    private fun Nextt() {
        val Nextt = Intent(this, DisplayAct::class.java)
        val bday = findViewById<TextView>(R.id.bdate).text.toString()
        val name =  intent.getStringExtra("fname")
        val surname = intent.getStringExtra("lname")
        val mail = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val contact = intent.getStringExtra("phone")
        val Info = "First Name: \t $name " +
                "\nLast Name: \t $surname " +
                "\nEmail: \t $mail " +
                "\nAge: \t $age " +
                "\nBirthday \t $bday" +
                "\nPhone Number: \t $contact"
        Nextt.putExtra("output", Info)
        startActivity(Nextt)
    }
    private fun Backk(){
        val intent2 = Intent(this, Activity2::class.java)
        startActivity(intent2)
    }

}
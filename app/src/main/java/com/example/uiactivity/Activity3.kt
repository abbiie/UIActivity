package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.SeekBar
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    lateinit var slider: SeekBar
    lateinit var value: TextView

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
        slider = findViewById(R.id.seekBar) as SeekBar
        value = findViewById(R.id.ageNum) as TextView
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

    }

    private fun Nextt() {
        val Nextt = Intent(this, DisplayAct::class.java)
        val bday = findViewById<TextView>(R.id.bdate).text.toString()
        val age =  findViewById<TextView>(R.id.ageNum).text.toString()
        val fname =  intent.getStringExtra("first name")
        val lname = intent.getStringExtra("last name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("Phone Number")
        val Info = "First Name: \t $fname " +
                "\nLast Name: \t $lname " +
                "\nEmail: \t $email " +
                "\nAge: \t $age " +
                "\nBirthday \t $bday" +
                "\nPhone Number: \t $phone"
        Nextt.putExtra("output", Info)
        startActivity(Nextt)
    }
    private fun Backk(){
        val intent2 = Intent(this, Activity2::class.java)
        startActivity(intent2)
    }

}
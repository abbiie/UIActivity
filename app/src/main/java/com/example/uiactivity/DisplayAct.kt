package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class DisplayAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        findViewById<Button>(R.id.MBtn).setOnClickListener{MainMenu()}
        val photos = intArrayOf(R.drawable.img4, R.drawable.img1, R.drawable.img2, R.drawable.img3)
        val img = findViewById<ImageView>(R.id.imageView) as ImageView
        val rdm = Random(randomized(1,4))
        val radm = (0..3).random()
        val i: Int = rdm.nextInt(photos.size)
        img.setImageResource(photos[radm])
        img.setOnClickListener() {
            val set: Int = rdm.nextInt(photos.size)
            img.setImageResource(photos[set])
        }
        val txt = findViewById<TextView>(R.id.Information)
        val output = intent.getStringExtra("output")
        txt.text = output
    }
    private fun randomized(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }
    private fun MainMenu(){
        val main = Intent(this, MainActivity::class.java)
        startActivity(main)
    }
}
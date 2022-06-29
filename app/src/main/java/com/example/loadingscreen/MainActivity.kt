package com.example.loadingscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val textView = findViewById<TextView>(R.id.textView)
        progressBar.max = 100
        progressBar.scaleY = 3f
        val anim = ProgressBarAnimation(
            this,progressBar, textView,0f,100f
        )
        anim.duration = 8000
        progressBar.animation = anim
    }
}
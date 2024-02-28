package com.example.languagelearning

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LessonsVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        val spanish: Button = findViewById(R.id.spanish)
        val mandarin: Button = findViewById(R.id.mandarin)

        mandarin.setOnClickListener {
            val intent = Intent(this, VideoListMandarinActivity::class.java)
            startActivity(intent)
        }

        spanish.setOnClickListener {
            val intent = Intent(this, VideoListActivity::class.java)
            startActivity(intent)
        }
    }
}

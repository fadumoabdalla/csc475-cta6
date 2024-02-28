package com.example.languagelearning

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme) // Make sure to call this before setContentView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLessons: Button = findViewById(R.id.btn_lessons)
        val btnVideos: Button = findViewById(R.id.btn_videos)
        val btnGames: Button = findViewById(R.id.btn_games)

        btnLessons.setOnClickListener {
            val intent = Intent(this, LessonsActivity::class.java)
            startActivity(intent)
        }

        btnVideos.setOnClickListener {
            val intent = Intent(this, LessonsVideoActivity::class.java)
            startActivity(intent)
        }

        btnGames.setOnClickListener {
            Toast.makeText(this, "Games Clicked", Toast.LENGTH_SHORT).show()
            // Intent for navigating to Games Activity
        }
    }
}

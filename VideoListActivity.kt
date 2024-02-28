package com.example.languagelearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VideoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_list)

        supportActionBar?.title = "Spanish from English"

        val videoList = arrayOf(
            "5hzThirJgV8",
            "9AUPuZYsRvU",
            "DAp_v7EH9AA",
            "4ehG-7v21NQ",
            "J1U2MpaYsdk",
            "4ehG-7v21NQ",
            "JVyYSLvdFo4",
            "ylKWkYVNzuk",
            "0FigTJ-4g48",
            "lJw40ENfr2w",
            "_L83Z89-4q4",
        ) // Replace VIDEO_ID_x with your actual YouTube video IDs

        val recyclerView: RecyclerView = findViewById(R.id.videoRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VideoListAdapter(videoList)
    }
}

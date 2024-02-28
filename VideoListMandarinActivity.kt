package com.example.languagelearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VideoListMandarinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_list)
        supportActionBar?.title = "Mandarin from English"

        val videoList = arrayOf(
            "LrNkgDVrKEw",
            "gWJndk4ANbE",
            "yMebwotqRHg",
            "8uchjTW-Fr4",
            "mHV79ZSNzfE",
            "MBd0Ps32RBg",
            "TB7x4buU7Dk",
            "yc2EaVdK_L4",
            "vONboSKhKXs",
            "rrW6v-TaW_E",
            "s3-R80GT4fw",
        ) // Replace VIDEO_ID_x with your actual YouTube video IDs

        val recyclerView: RecyclerView = findViewById(R.id.videoRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VideoListAdapter(videoList)
    }
}

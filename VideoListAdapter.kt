package com.example.languagelearning

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class VideoListAdapter(private val videoList: Array<String>) :
    RecyclerView.Adapter<VideoListAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoId = videoList[position]
        holder.youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                super.onReady(youTubePlayer)
                youTubePlayer.cueVideo(videoId, 0f)
                holder.youtubePlayerViewLap.background = null
            }


        })
//        holder.videoTitle.text = getTitleQuietly("https://youtu.be/$videoId")
//        holder.videoDescription.text = "Video Description $position"

        holder.youtubePlayerViewLap.setOnClickListener {
            val intent = Intent(it.context, VideoPlayerActivity::class.java)
            intent.putExtra("videoId", videoId)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val youtubePlayerView: YouTubePlayerView = itemView.findViewById(R.id.youtubePlayerView)
        val youtubePlayerViewLap: LinearLayout = itemView.findViewById(R.id.youtubePlayerViewLap)
        val videoTitle: TextView = itemView.findViewById(R.id.videoTitle)
        val videoDescription: TextView = itemView.findViewById(R.id.videoDescription)
    }
}

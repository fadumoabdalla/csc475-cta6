package com.example.languagelearning// WordAdapter.kt
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(private val context: Context, private val words: List<Word>) :
    RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val originalTextView: TextView = itemView.findViewById(R.id.originalTextView)
        val translationTextView: TextView = itemView.findViewById(R.id.translationTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_word, parent, false)
        return WordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val currentWord = words[position]
        holder.originalTextView.text = currentWord.original
        holder.translationTextView.text = currentWord.translation
    }

    override fun getItemCount(): Int {
        return words.size
    }
}

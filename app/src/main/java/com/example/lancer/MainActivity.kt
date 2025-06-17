package com.example.lancer

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.media.MediaPlayer
import android.widget.ImageButton


class MainActivity : ComponentActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mediaPlayer = MediaPlayer.create(this, R.raw.splat2)

        val playSoundButton: ImageButton = findViewById(R.id.splat)

        playSoundButton.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.seekTo(0)
            }
            mediaPlayer.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}


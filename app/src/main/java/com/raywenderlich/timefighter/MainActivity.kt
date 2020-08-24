package com.raywenderlich.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView: TextView
    private lateinit var tapMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO connect views to variables
    }

    private  fun incrementScore() {
        //TODO increment score logic
    }

    private fun resetGame() {
        //TODO reset game logic
    }

    private fun startGame() {
        //TODO start game logic
    }

    private fun endGame() {
        //TODO end game logic
    }
}
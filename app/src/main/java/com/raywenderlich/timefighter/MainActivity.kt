package com.raywenderlich.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView: TextView
    private lateinit var tapMeButton: Button

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1
        gameScoreTextView = findViewById(R.id.game_score_text_view)

        timeLeftTextView = findViewById(R.id.time_left_text_view)

        tapMeButton = findViewById(R.id.tap_me_button)

        //2
        tapMeButton.setOnClickListener { incrementScore() }
    }

    private  fun incrementScore() {
        score++

        val newScore = "Your Score: $score"
        gameScoreTextView.text = newScore
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
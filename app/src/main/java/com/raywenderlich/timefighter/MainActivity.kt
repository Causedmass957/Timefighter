package com.raywenderlich.timefighter

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView: TextView
    private lateinit var tapMeButton: Button

    private var score = 0
    private  var gameStarted = false

    private lateinit var countDownTimer: CountDownTimer
    private var initialCountDown: Long = 60000
    private var countDownInterval: Long = 1000
    private var timeLeft = 60

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1
        gameScoreTextView = findViewById(R.id.game_score_text_view)

        timeLeftTextView = findViewById(R.id.time_left_text_view)

        tapMeButton = findViewById(R.id.tap_me_button)

        //2
        tapMeButton.setOnClickListener { incrementScore() }

        resetGame()
    }

    private  fun incrementScore() {
        score++

        val newScore = getString(R.string.your_score, score)
        gameScoreTextView.text = newScore
    }

    private fun resetGame() {
        //1
        score = 0

        val initiateScore = getString(R.string.your_score, score)
        gameScoreTextView.text = initiateScore

        val initialTimeLeft = getString(R.string.time_left, 60)
        timeLeftTextView.text = initialTimeLeft

        //2
        countDownTimer = object : CountDownTimer(initialCountDown, countDownInterval) {
            override fun onTick(millisUntilFinished: long) {
                timeLeft = millisUntilFinished.toInt() / 1000

                val timeLeftString = getString(R.string.time_left, timeLeft)
                timeLeftTextView.tect = timeLeftString
            }

            override fun onFinish() {
                //TODO implemented late
            }
        }

        //4
        gameStarted = false
    }

    private fun startGame() {
        //TODO start game logic
    }

    private fun endGame() {
        //TODO end game logic
    }
}
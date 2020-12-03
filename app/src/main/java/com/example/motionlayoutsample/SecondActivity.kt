package com.example.motionlayoutsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setListeners()

    }

    private fun setListeners() {
        btn_beginers_guide?.setOnClickListener {
            startActivity(Intent(this@SecondActivity, MainActivity::class.java))
        }

        btn_on_swipe?.setOnClickListener {
            startActivity(Intent(this@SecondActivity, SwipeAnimationScreen::class.java))
        }
    }
}
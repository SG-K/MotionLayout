package com.example.motionlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.twitter_animation_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.twitter_animation_layout)

        motionlayout?.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.v("trackingg", "got it")
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
                finish()
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) { }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) { }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) { }
        })
    }

    override fun onResume() {
        super.onResume()
        motionlayout?.startLayoutAnimation()
    }
}
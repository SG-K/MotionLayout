package com.example.motionlayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_swipe_unloack.*

class SwipeAnimationScreen : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_unloack)
        lay_lock_main?.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentState: Int) {
                /* Check if user completely transitioned to the right */
                if (currentState == motionLayout?.endState) {
                    lay_lock_main?.background = ContextCompat.getDrawable(this@SwipeAnimationScreen,
                        R.drawable.shape_green_round_rect)
                    lay_lock_main.isInteractionEnabled = false
//                    tv_lable?.text = "Good Job!!"
                }
            }
        })
    }

}


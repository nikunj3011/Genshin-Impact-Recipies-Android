package com.example.gravvity20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class LoadActivity : AppCompatActivity() {
    private var x1: Float = 0F;
    private var x2: Float = 0F;
    private var y1: Float = 0F;
    private var y2: Float = 0F;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)
    }

    override fun onTouchEvent(touchEvent: MotionEvent): Boolean {
        if (touchEvent.action == MotionEvent.ACTION_DOWN) {
            x1 = touchEvent.x
            y1 = touchEvent.y
        } else if (touchEvent.action == MotionEvent.ACTION_UP) {
            x2 = touchEvent.x
            y2 = touchEvent.y

            if (y2 <= y1) {
                startActivity(Intent(this, MainActivity::class.java))
                overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in,
                    androidx.appcompat.R.anim.abc_fade_in)
            }
        }
        return false
    }
}
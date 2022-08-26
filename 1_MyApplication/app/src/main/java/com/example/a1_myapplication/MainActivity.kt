package com.example.a1_myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface


class MainActivity : AppCompatActivity() {
    private var slidr: SlidrInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        slidr = Slidr.attach(this)
    }

//    public lockSlide(View v) {
//        slidr.lock()
//    }
//
//    public unlockSlide(View v) {
//        slidr.unlock()
//    }
}
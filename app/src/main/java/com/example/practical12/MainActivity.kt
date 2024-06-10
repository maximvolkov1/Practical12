package com.example.practical12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView : ImageView = findViewById(R.id.sun)
        val sunRiseAnimation : Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        imageView.startAnimation(sunRiseAnimation)
        val clock : ImageView = findViewById(R.id.clock)
        val clockTurnAnimation : Animation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        clock.startAnimation(clockTurnAnimation)
        val hour : ImageView = findViewById(R.id.hour_hand)
        val hourTurnAnimation : Animation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
        hour.startAnimation(hourTurnAnimation)
    }
}
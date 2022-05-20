package com.example.session_islamii.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.session_islamii.R
import com.example.session_islamii.ui.home.Homeactivity

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper())
            .postDelayed(Runnable {
                startactivity()
            }, 2000)
    }

    private fun startactivity() {
        val intent: Intent = Intent(this, Homeactivity::class.java)
        startActivity(intent)
        finish()

    }
}
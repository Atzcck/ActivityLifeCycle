package com.alptazecicek.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("systemOut","onCreate called.")
    }

    override fun onStart() {
        super.onStart()
        Log.v("systemOut","onStart called.")
    }

    override fun onResume() {
        super.onResume()
        Log.v("systemOut","onResume called.")
    }

    override fun onPause() {
        super.onPause()
        Log.v("systemOut","onPause called.")
    }

    override fun onStop() {
        super.onStop()
        Log.v("systemOut","onStop called.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("systemOut", "onRestart called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("systemOut","onDestroy called.")
    }
}
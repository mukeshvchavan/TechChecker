package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {

    var TAG : String = "ActivityAA"

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            Log.v(TAG, "onCreate()")
            setContentView(R.layout.activity_a)

            button4.setOnClickListener{
                val intent = Intent(this@ActivityA, ActivityB::class.java)
                startActivity(intent)
            }
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }
}
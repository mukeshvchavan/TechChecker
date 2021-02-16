package com.example.myapp2

import android.app.Activity
import android.os.Bundle
import android.os.Vibrator
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class VibrationMain : AppCompatActivity() {
    var buttonVibrate: Button? = null
    var Vibrator: Vibrator? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vibration_layout)
        buttonVibrate = findViewById<View>(R.id.vibrate) as Button
        Vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator
        buttonVibrate!!.setOnClickListener { // TODO Auto-generated method stub
            Vibrator!!.vibrate(1000)
        }
    }
}

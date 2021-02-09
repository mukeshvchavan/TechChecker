package com.example.myapp2

import android.net.wifi.WifiManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WiFiMain : AppCompatActivity() {
    private var wifiManager: WifiManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wifi_layout)
        wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
    }

    fun enableWifi(view: View?) {
        wifiManager!!.isWifiEnabled = true
        Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
    }

    fun disableWifi(view: View?) {
        wifiManager!!.isWifiEnabled = false
        Toast.makeText(this, "Wifi Disabled", Toast.LENGTH_SHORT).show()
    }
}
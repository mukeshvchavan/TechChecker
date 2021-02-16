package com.example.myapp2

import android.annotation.SuppressLint
import android.bluetooth.BluetoothManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BluetoothMain : AppCompatActivity() {

    private var bluetoothManager: BluetoothManager? = null
    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bluetooth_layout)
        bluetoothManager = applicationContext.getSystemService(BLUETOOTH_SERVICE) as BluetoothManager
    }

    fun enableBluetooth(view: View) {
        Toast.makeText(this,"Bluetooth Enabled", Toast.LENGTH_SHORT).show()
    }
    fun disableBluetooth(view: View) {
        Toast.makeText(this,"Bluetooth Disabled", Toast.LENGTH_SHORT).show()
    }
}
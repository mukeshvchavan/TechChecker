package com.example.myapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.E

class RecMainActivity : AppCompatActivity(),ExampleAdapter.OnItemClickListener {
    private val list = ArrayList<ExampleItem>()
    private lateinit var exampleAdapter: ExampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycl_view)
        settingData()
        exampleAdapter = ExampleAdapter(list, this)
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = exampleAdapter
    }


    private fun settingData() {
        list.add(ExampleItem(R.drawable.ic_baseline_phone, "About phone"))
        list.add(ExampleItem(R.drawable.ic_baseline_perm_contact_calendar_24, "Calender"))
        list.add(ExampleItem(R.drawable.ic_baseline_wallpaper, "Wallpaper"))
        list.add(ExampleItem(R.drawable.ic_baseline_wifi, "WiFi"))
        list.add(ExampleItem(R.drawable.ic_baseline_sim_card, "Sim card & Mobile Network"))
        list.add(ExampleItem(R.drawable.ic_baseline_security, "Security"))
        list.add(ExampleItem(R.drawable.ic_baseline_access_time_24, "Clock"))
        list.add(ExampleItem(R.drawable.ic_baseline_account_box_24, "My Account"))
        list.add(ExampleItem(R.drawable.ic_baseline_system_update_24, "Update"))
        list.add(ExampleItem(R.drawable.ic_baseline_account_circle_24, "Google"))
        list.add(ExampleItem(R.drawable.ic_baseline_airplanemode_active_24, "Airoplane Mode"))
        list.add(ExampleItem(R.drawable.ic_baseline_apps_24, "Apps"))
        list.add(ExampleItem(R.drawable.ic_baseline_battery_charging_full_24, "Battey"))
        list.add(ExampleItem(R.drawable.ic_baseline_bluetooth_24, "Bluetooth"))
        list.add(ExampleItem(R.drawable.ic_baseline_brightness_5_24, "Brightness"))
        list.add(ExampleItem(R.drawable.ic_baseline_calculate_24, "Calculator"))
        list.add(ExampleItem(R.drawable.ic_baseline_wallpaper, "Wallpaper"))
        list.add(ExampleItem(R.drawable.ic_baseline_fingerprint_24, "Lock Screen"))
        list.add(ExampleItem(R.drawable.ic_baseline_accessibility_new_24, "Accessibility"))
        list.add(ExampleItem(R.drawable.ic_baseline_camera_alt_24, "Camera"))
        list.add(ExampleItem(R.drawable.ic_baseline_cast_24, "Cast"))
        list.add(ExampleItem(R.drawable.ic_baseline_palette_24, "Theme"))
        list.add(ExampleItem(R.drawable.ic_baseline_vpn_key_24, "VPN"))
        list.add(ExampleItem(R.drawable.ic_baseline_cloud_24, "Cloud"))
        list.add(ExampleItem(R.drawable.ic_baseline_devices_other_24, "Other Devices"))
        list.add(ExampleItem(R.drawable.ic_baseline_language_24, "Languages"))
        list.add(ExampleItem(R.drawable.ic_baseline_folder_24, "Folder"))
        list.add(ExampleItem(R.drawable.ic_baseline_highlight_24, "Torch"))
        list.add(ExampleItem(R.drawable.ic_baseline_vibration,"Vibrate"))
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "" + list[position].text, Toast.LENGTH_SHORT).show()
        val clickedItem = list[position]

        if (list[position].text == "WiFi"){
            val intent = Intent(this, WiFiMain::class.java)
            startActivity(intent)
        }
        if (list[position].text=="Bluetooth"){
            val intent = Intent(this, BluetoothMain::class.java)
            startActivity(intent)
        }
        if(list[position].text=="Camera"){
            val intent = Intent(this, CameraMain::class.java)
            startActivity(intent)
        }
        if (list[position].text=="Vibrate"){
            val intent = Intent(this, VibrationMain::class.java)
            startActivity(intent)
        }

    }
}



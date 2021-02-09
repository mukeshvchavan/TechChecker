package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycl_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        floatingActionButton2.setOnClickListener {

            val intent = Intent(this@MainActivity, ActivityRegister::class.java)
            startActivity(intent)
        }



        var editEmailAddress: String? = ""
        var editPasswordAdd: String? = ""

        btnLogin.setOnClickListener {
            editEmailAddress = edtEmail.text.toString()
            editPasswordAdd = editTextNumberPassword.text.toString()

            if (editEmailAddress?.equals("")!!) {
                Toast.makeText(this, "Please enter email address", Toast.LENGTH_SHORT).show()
            } else if (!editEmailAddress?.contains("@")!!) {
                Toast.makeText(this, "Please enter valid email address", Toast.LENGTH_SHORT).show()
            } else if (!editEmailAddress?.contains(".")!!) {
                Toast.makeText(this, "Please enter valid email address", Toast.LENGTH_SHORT).show()
            } else if (editPasswordAdd?.equals("")!!) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
            } else if (editPasswordAdd!!.length < 6) {
                Toast.makeText(this, "Password cannot be less than 6 characters!", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity, RecMainActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun enableWifi(view: View) {}
    fun disableWifi(view: View) {}

}

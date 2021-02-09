package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.editTextNumberPassword
import kotlinx.android.synthetic.main.register.edtEmail

class ActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        imageButton.setOnClickListener{
            val intent = Intent(this@ActivityRegister, MainActivity::class.java)
            startActivity(intent)
        }

        var editName: String? =""
        var editLastname: String? =""
        var editEmailAddress: String? = ""
        var editPasswordAdd: String? = ""


        button2.setOnClickListener{
            editName = editTextTextPersonName.text.toString()
            editLastname = editTextTextPersonName2.text.toString()
            editEmailAddress = edtEmail.text.toString()
            editPasswordAdd = editTextNumberPassword.text.toString()

            if (editName?.equals("")!!){
                Toast.makeText(this, "Please enter name", Toast.LENGTH_SHORT).show()
            } else if (editLastname?.equals("")!!){
                Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show()
            } else if (editEmailAddress?.equals("")!!) {
                Toast.makeText(this, "Please enter email address", Toast.LENGTH_SHORT).show()
            } else if (!editEmailAddress?.contains("@")!!) {
                Toast.makeText(this, "Please enter valid email address", Toast.LENGTH_SHORT).show()
            } else if (!editEmailAddress?.contains(".")!!) {
                Toast.makeText(this, "Please enter valid email address", Toast.LENGTH_SHORT).show()
            } else if (editPasswordAdd?.equals("")!!) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
            } else if (editPasswordAdd!!.length < 6){
                Toast.makeText(this, "Password cannot be less than 6 characters!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
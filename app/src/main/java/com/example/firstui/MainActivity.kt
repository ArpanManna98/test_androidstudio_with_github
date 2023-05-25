package com.example.firstui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var etusername: EditText
    lateinit var etpassword: EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etusername=findViewById(R.id.etusername)
        etpassword=findViewById(R.id.etpassword)
        btnLogin=findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
            "Toast implemented",
            Toast.LENGTH_LONG
            ).show()
        }

    }
}
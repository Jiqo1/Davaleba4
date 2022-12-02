package com.example.davaleba4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var editUserName : EditText
    private lateinit var editSurName : EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.nextbtn)
        editUserName = findViewById(R.id.editText)
        editSurName = findViewById(R.id.text2)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))

        }

    }
}

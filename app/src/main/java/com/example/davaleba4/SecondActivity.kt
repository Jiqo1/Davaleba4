package com.example.davaleba4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private lateinit var btn3zma : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn3zma = findViewById(R.id.button3)


        btn3zma.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))

        }

    }
}
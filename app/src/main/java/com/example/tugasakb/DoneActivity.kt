package com.example.tugasakb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_done)

        val btnClick = findViewById(R.id.d_btn1) as Button
        btnClick.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}

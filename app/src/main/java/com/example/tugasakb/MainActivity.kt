package com.example.tugasakb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_main)

        val btnClick = findViewById(R.id.button1) as Button
        btnClick.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}

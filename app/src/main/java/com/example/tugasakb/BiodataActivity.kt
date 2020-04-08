package com.example.tugasakb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BiodataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_biodata)

        val etMessage1 = findViewById(R.id.b_tedit1) as EditText
        val etMessage2 = findViewById(R.id.b_tedit2) as EditText
        val btnClick = findViewById(R.id.b_btn1) as Button
        btnClick.setOnClickListener {
            val msg: String = etMessage1.text.toString()
            val msg2: String = etMessage2.text.toString()

            if (msg.trim().length > 0 && msg2.trim().length > 0) {
                Toast.makeText(applicationContext, "Sukses", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, DoneActivity::class.java))
            } else {
                Toast.makeText(applicationContext, "Harap isi Nama dan Umur kamu!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

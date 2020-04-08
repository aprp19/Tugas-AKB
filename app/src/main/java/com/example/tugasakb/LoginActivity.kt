package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}
        setContentView(R.layout.activity_login)

        val etMessage = findViewById(R.id.t_edit1) as EditText
        val btnClick = findViewById(R.id.btn2) as Button
        btnClick.setOnClickListener {
            val msg: String = etMessage.text.toString()

            if (msg == "A1B2C3"){
                Toast.makeText(applicationContext, "Kode Benar", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, BiodataActivity::class.java))
            } else {
                Toast.makeText(applicationContext, "Kode Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

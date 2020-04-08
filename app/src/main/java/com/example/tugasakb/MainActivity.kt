package com.example.tugasakb

/*
NIM   : 10117130
NAMA  : ANGGA PUJA RESTU PRAKASA
KELAS : IF4
TUGAS : LATIHAN 1
TANGGAL PENGERJAAN : SENIN, 06 - 04 - 2020
DESKRIPSI PENGERJAAN :
    TGL 6 - AWAL PENGERJAAN MAIN ACTIVITY
    TGL 7 - PENYELESAIAN LOGIN ACTIVITY
    TGL 8 - PENYELESAIAN BIODATA DAN DONE ACTIVITY, PENGERJAAN SELESAI
*/

import android.content.Intent
import android.os.Bundle
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

package com.example.parentzfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

public class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        //Perpindahan ke halaman regis lewat text RegisDisni
        val keRegis = findViewById<TextView>(R.id.textRegisDisini)
        keRegis.setOnClickListener {
            // Ganti ke halaman Regis
            val intent = Intent(this, Regis::class.java)
            startActivity(intent)
        }

        val keBeranda = findViewById<Button>(R.id.buttonLogin)
        keBeranda.setOnClickListener {
            val intent = Intent(this, Beranda::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
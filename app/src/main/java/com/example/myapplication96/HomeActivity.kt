package com.example.myapplication96

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvWelcomeMesaage: TextView = findViewById(R.id.tv_welcome_message)
        val username = intent.getStringExtra("EXTRA_USERNAME")

        tvWelcomeMesaage.text = "Selamat Datang, $username!"

        val btnBukaWeb: Button = findViewById(R.id.btnBukaWeb)
        btnBukaWeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://amikom.ac.id"))
            startActivity(intent)
        }
    }
}
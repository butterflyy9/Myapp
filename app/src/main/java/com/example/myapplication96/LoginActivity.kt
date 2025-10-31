package com.example.myapplication96

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Pastikan ini sesuai dengan nama file layout kamu
        setContentView(R.layout.activity_login)

        // Hubungkan komponen dari layout XML
        val etEmail: EditText = findViewById(R.id.editTextText2)
        val etPassword: EditText = findViewById(R.id.editTextText3)
        val btnLogin: Button = findViewById(R.id.button2)
        val btnDaftar: Button = findViewById(R.id.button3)

        // Aksi saat tombol Login ditekan
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email dan Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                // Login sederhana (contoh)
                if (email == "admin@amikom.ac.id" && password == "12345") {
                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()

                    // Pindah ke HomeActivity dan kirim data
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("EXTRA_USERNAME", email)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Email atau Password salah!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        // Aksi saat tombol Daftar ditekan
        btnDaftar.setOnClickListener {
            // Pindah ke halaman register jika sudah tersedia
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}

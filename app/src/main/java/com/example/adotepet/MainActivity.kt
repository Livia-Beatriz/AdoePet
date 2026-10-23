package com.example.projetotarefas

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adotepet.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLuna = findViewById<Button>(R.id.btnLuna)
        val btnThor = findViewById<Button>(R.id.btnThor)
        val btnMel = findViewById<Button>(R.id.btnMel)
        val btnBob = findViewById<Button>(R.id.btnBob)

        btnLuna.setOnClickListener {
            mostrarMensagem("Luna")
        }

        btnThor.setOnClickListener {
            mostrarMensagem("Thor")
        }

        btnMel.setOnClickListener {
            mostrarMensagem("Mel")
        }

        btnBob.setOnClickListener {
            mostrarMensagem("Bob")
        }
    }

    private fun mostrarMensagem(nome: String) {
        Toast.makeText(
            this,
            "Você selecionou $nome!",
            Toast.LENGTH_SHORT
        ).show()
    }
}
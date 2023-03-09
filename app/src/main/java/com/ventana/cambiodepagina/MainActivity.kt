package com.ventana.cambiodepagina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miButton:Button = findViewById(R.id.buttoningresar)
        miButton.setOnClickListener {onClick()}
    }

    private fun onClick() {
        val campoTexto:EditText = findViewById(R.id.editTextTextPersonName)
        var nombre:String = campoTexto.text.toString()

        val textResultado:TextView = findViewById(R.id.textView5)
        textResultado.text = "Bienvenid@ $nombre"

        Toast.makeText(this, "Bienvenid@ $nombre", Toast.LENGTH_SHORT).show()
    }
}
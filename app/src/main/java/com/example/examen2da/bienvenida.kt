package com.example.examen2da

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityBienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val txtNombre = findViewById<TextView>(R.id.txtNombre);
        val btnSalir = findViewById<Button>(R.id.btnRegresar);
        txtNombre.text = intent.getStringExtra("nombres") + " "  + intent.getStringExtra("apellidos");

        btnSalir.setOnClickListener{
            finish();
        }
    }
}
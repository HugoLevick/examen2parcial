package com.example.examen2da

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

val personas = listOf<Persona>(Persona("Hugo Levick", "Alvarez Luna"),
                               Persona("Juan Diego", "Salazar Gutiérrez"));

val usuarioApp = "hugo";
val contraApp = "1234";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.btnIniciar);
        val edtUsuario = findViewById<EditText>(R.id.edtUsuario);
        val edtContra = findViewById<EditText>(R.id.edtContra);

        btnEnviar.setOnClickListener {

            val usuario = edtUsuario.text.toString();
            val contra = edtContra.text.toString();

            Log.i("Btn", usuario);
            Log.i("Btn", contra);

            if(usuario.isEmpty() || contra.isEmpty()) {
                Toast.makeText(this, "Por favor llena los campos necesarios", Toast.LENGTH_SHORT).show();
            } else if(usuario != usuarioApp || contra != contraApp){
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            } else {
                val intentBienvenida = Intent(this, ActivityBienvenida::class.java).apply {
                    putExtra("nombres", personas[1].nombres);
                    putExtra("apellidos", personas[1].apellidos);
                }

                startActivity(intentBienvenida);
            }

        }
    }
}
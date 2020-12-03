package com.ulisesdiaz.navegacionactividades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.btnActividadB)

        boton.setOnClickListener {
            var intent = Intent( this, ActivityB::class.java)
            intent.putExtra("MENSAJE", "Hacia actividad B")
            startActivity(intent)
        }
    }
}
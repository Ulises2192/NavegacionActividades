package com.ulisesdiaz.navegacionactividades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val  btnActividadC = findViewById<Button>(R.id.btnActividadC)
        val btnActividadD = findViewById<Button>(R.id.btnActividadD)

        var mensaje = intent.getStringExtra("MENSAJE")
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()


        btnActividadC.setOnClickListener {
            intent = Intent(this, ActivityC::class.java)
            intent.putExtra("MENSAJE", "Hacia actividad C")
            startActivity(intent)
        }

        btnActividadD.setOnClickListener {
            intent = Intent(this, ActivityD::class.java)
            intent.putExtra("MENSAJE", "Hacia actividad D")
            startActivity(intent)
        }
    }
}
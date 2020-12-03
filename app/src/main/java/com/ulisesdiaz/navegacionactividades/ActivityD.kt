package com.ulisesdiaz.navegacionactividades

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        var mensaje = intent.getStringExtra("MENSAJE")
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}
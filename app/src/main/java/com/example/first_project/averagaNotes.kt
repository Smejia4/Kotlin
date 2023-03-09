package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class averagaNotes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_averaga_notes)

        var txtMensaje = findViewById<TextView>(R.id.txtMensaje)
        val btnReturn:Button=findViewById(R.id.btnReturn)
        btnReturn.setOnClickListener { onClick() }
    }

    private fun onClick(){
        finish()
    }
}
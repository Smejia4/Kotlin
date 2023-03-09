package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.widget.Button
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton:Button= findViewById(R.id.btnLogin)
        myButton.setOnClickListener{onClick()}
    }

    private fun onClick(){
        val fieldTxt:EditText= findViewById(R.id.txtUserName)
        var name:String= fieldTxt.text.toString()

        val toggleBtn:ToggleButton= findViewById(R.id.toggleButton)
        toggleBtn.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this,"Bienvenido $name, \n toogle activo",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Bienvenido $name, \n toogle inactivo",Toast.LENGTH_LONG).show()
            }
        }

    }

}
package com.example.first_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var fieldTxt:EditText? = null
    var name:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton:Button= findViewById(R.id.btnLogin)
        myButton.setOnClickListener{onClick(1)}

        val btnNext:Button= findViewById(R.id.btnNext)
        btnNext.setOnClickListener { onClick(2) }
    }

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private fun onClick(button:Int){
        when(button){
            1 -> {
                 fieldTxt= findViewById(R.id.txtUserName)
                 name= fieldTxt!!.text.toString()

                val toggleBtn:ToggleButton= findViewById(R.id.toggleButton)
                var statusToggle:String = ""
                if (toggleBtn.isChecked) {
                    statusToggle += "Toogle activo"
                } else {
                    statusToggle += "Toogle inactivo"
                }


                val switchBtn:Switch = findViewById(R.id.switch1)
                var statusSwitch:String = ""
                if (switchBtn.isChecked) {
                    statusSwitch += "Switch activo"
                } else {
                    statusSwitch += "Switch inactivo"
                }


                val checkOne:CheckBox =findViewById(R.id.checkBox)
                val checkTwo:CheckBox =findViewById(R.id.checkBox2)
                var checkResult: String = ""
                if (checkOne.isChecked){
                    checkResult += "Check 1 activo "
                }else{
                    checkResult += "Check 1 inactivo "
                }
                if (checkTwo.isChecked) {
                    checkResult += "Check 2 activo "
                }else{
                    checkResult += "Check 2 inactivo "
                }

                val radioOne:RadioButton =findViewById(R.id.radioButton)
                val radioTwo:RadioButton =findViewById(R.id.radioButton2)
                var radioResult: String = ""
                if (radioOne.isChecked){
                    radioResult += "opcion 1 seleccionada "
                }else{
                    radioResult += "opcion 1 no seleccionada"
                }

                if(radioTwo.isChecked) {
                    radioResult += "opcion 2 seleccionada "
                }else{
                    radioResult += "opcion 2 no seleccionada"
                }

                val message = "$name, $statusToggle ,$statusSwitch, $checkResult, $radioResult"

                Toast.makeText(this, message , Toast.LENGTH_LONG).show()
            }

            2 ->{
                val intent = Intent(this,averagaNotes::class.java)
                startActivity(intent)
            }
        }

    }

}
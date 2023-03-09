package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

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

        var toggleBtn:ToggleButton= findViewById(R.id.toggleButton)
        var statusToggle:String = ""
        toggleBtn.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                statusToggle = "Toogle activo"
            } else {
                statusToggle = "Toogle inactivo"
            }
        }

        var switchBtn:Switch = findViewById(R.id.switch1)
        var statusSwitch:String = ""
            switchBtn.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                   statusSwitch= "Switch activo"
                } else {
                    statusSwitch = "Switch inactivo"
                }
            }

        var checkOne:CheckBox =findViewById(R.id.checkBox)
        var checkTwo:CheckBox =findViewById(R.id.checkBox2)
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

        var radioOne:RadioButton =findViewById(R.id.radioButton)
        var radioTwo:RadioButton =findViewById(R.id.radioButton2)
        var radioResult: String = ""
        if (radioOne.isChecked){
            radioResult += "opcion 1"
        }else{
            radioResult += "error"
        }

        if(radioTwo.isChecked) {
            radioResult += "opcion 2 "
        }else{
            radioResult += "error"
        }

        Toast.makeText(this,"$name \n $statusToggle \n $statusSwitch \n $checkResult \n $radioResult", Toast.LENGTH_LONG).show()
    }

}
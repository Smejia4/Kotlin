package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.first_project.R.color.green
import com.example.first_project.R.color.red
import org.w3c.dom.Text

@Suppress("DEPRECATION")
class averagaNotes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_averaga_notes)

        val btnCalculate:Button=findViewById(R.id.btnCalculate)
        btnCalculate.setOnClickListener{ onClick(1) }

        val btnReturn:Button=findViewById(R.id.btnReturn)
        btnReturn.setOnClickListener { onClick(2) }
    }

    private fun onClick(btn:Int){
        when(btn){
            1->{
                var txtStudentName:EditText= findViewById(R.id.txtStudentName)
                var studentName:String= txtStudentName.text.toString()

                var txtSubject:EditText = findViewById(R.id.nameSubject)
                var subject:String= txtSubject.text.toString()

                var txtNote1:EditText= findViewById(R.id.note)
                var note1:Double = txtNote1.text.toString().toDouble()
                var txtNote2:EditText= findViewById(R.id.note2)
                var note2:Double = txtNote2.text.toString().toDouble()
                var txtNote3:EditText= findViewById(R.id.note3)
                var note3:Double = txtNote3.text.toString().toDouble()

                var average: Double = (note1+note2+note3)/3

                val txtResult:TextView = findViewById(R.id.txtResult)

                var status:String = ""
                if(average >= 3.5){
                    txtResult.setBackgroundColor(resources.getColor(green));
                    status = "APROBO la materia"
                }else{
                    txtResult.setBackgroundColor(resources.getColor(red))
                    status = "REPROBO la materia "
                }

                var message:String="Usted $studentName obtuvo un promedio de $average en la materia $subject y $status"

                txtResult.text=message
            }

            2->{
                finish()
            }
        }
    }
}
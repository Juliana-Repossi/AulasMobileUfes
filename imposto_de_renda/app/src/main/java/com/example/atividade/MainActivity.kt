package com.example.atividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atividade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextSalario = findViewById<EditText>("@+id/editText_Salario")
        val editTextGastos = findViewById<EditText>("@+id/editText_Gastos")
        val buttomCalcular = findViewById<Button>("@+id/button_calculate")

        buttomCalcular.setOnClickListener{
            val salario = editTextSalario.text.toString().toFloat()
            val gastos = editTextGastos.text.toString()

            if(salario>0){
                //calcular o IR
                


            }
        }

    }

}
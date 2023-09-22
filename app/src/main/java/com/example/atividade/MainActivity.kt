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
            val salario = editTextSalario.text.toString()
            val gastos = editTextGastos.text.toString()

            if(salario.isNotEmpty() && salario>0){
                //calcular o IR

//                var impostoSemGasto = when(salario){
//                    in 0..1903,98 -> "Está no intervalo de 1 a 10"
//                    in 1903,98..2826,65 -> "Está no intervalo de 11 a 20"
//                    in 2826,65..3751,05 -> "Está no intervalo de 21 a 30"
//                    in 3751,05..4664,68 -> "Está no intervalo de 21 a 30"
//                    else -> "Não está em nenhum intervalo conhecido"


                }

            }
        }

    }

}
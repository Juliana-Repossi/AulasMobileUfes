package com.example.animais

import Constantes.Constants
import MySharedPref
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.animais.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mainsp : MySharedPref
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainsp = MySharedPref(this, Constants.SP_NAME)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ButtonGuardar.setOnClickListener(this)

    }

    override fun onClick(view: View, ) {

        if(view.id == R.id.Button_guardar){
            val name = binding.EditTextName.text.toString()

            if(name.isEmpty()){
                //mostrar um alerta
                Toast.makeText(this, "Voce deve digitar o seu nome", Toast.LENGTH_SHORT).show()
            }else{
                mainsp.setString(Constants.NAME_USER, binding.EditTextName.text.toString())
            }
        }
    }

}
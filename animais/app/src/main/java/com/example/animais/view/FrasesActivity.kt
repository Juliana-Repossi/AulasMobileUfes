package com.example.animais.view

import Constantes.Constants
import MySharedPref
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animais.databinding.ActivityFrasesBinding

class FrasesActivity : AppCompatActivity() {

    lateinit var mainsp : MySharedPref
    lateinit var binding: ActivityFrasesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainsp = MySharedPref(this, Constants.SP_NAME)
        binding = ActivityFrasesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewName.text = binding.textViewName.text.toString() + mainsp.getString(Constants.NAME_USER)

    }

}
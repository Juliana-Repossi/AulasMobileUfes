package com.example.animais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animais.databinding.ActivityFrasesBinding

class FrasesActivity : AppCompatActivity() {

    lateinit var binding: ActivityFrasesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFrasesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
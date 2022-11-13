package com.example.capitalsquiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capitalsquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sheredpreferens = getSharedPreferences("quizGame ", Context.MODE_PRIVATE)

        binding.btnStart.setOnClickListener {
            val name = binding.etName.text.toString()
            if (name.isEmpty() || name.isBlank()) {
                binding.tilName.error = "Atindi jaz aquday :) "
            } else {
                sheredpreferens.edit().putString("username", name).apply()
                val intent = Intent(this, GameActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}

package com.tige_ral_ramirez.viewbinding_puzzle_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.tige_ral_ramirez.viewbinding_puzzle_2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.transformButton.setOnClickListener {

            buttonPressed()
        }
    }

    fun buttonPressed(): Unit {

        var textIntroduced: String = binding.writeMe.getText().toString()
        var textIntroducedUppercase : String = textIntroduced.uppercase()
        binding.finalText.setText(textIntroducedUppercase)
    }
}
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        new -> old (new + old)
        var new = "0"
        var old = "0"

        binding.result.setText("0")

        binding.clear.setOnClickListener {
            new = "0"
            old = "0"
            binding.result.setText("0")
        }

        binding.number1.setOnClickListener {
            new = new + "1"
            binding.result.setText(new)
        }
        binding.number2.setOnClickListener {
            new = new + "2"
            binding.result.setText(new)
        }
        binding.number3.setOnClickListener {
            new = new + "3"
            binding.result.setText(new)
        }
        binding.number4.setOnClickListener {
            new = new + "4"
            binding.result.setText(new)
        }

        binding.number5.setOnClickListener {
            new = new + "5"
            binding.result.setText(new)
        }
        binding.number6.setOnClickListener {
            new = new + "6"
            binding.result.setText(new)
        }
        binding.number7.setOnClickListener {
            new = new + "7"
            binding.result.setText(new)
        }
        binding.number8.setOnClickListener {
            new = new + "8"
            binding.result.setText(new)
        }
        binding.number9.setOnClickListener {
            new = new + "9"
            binding.result.setText(new)
        }
        binding.number0.setOnClickListener {
            new = new + "0"
            binding.result.setText(new)
        }
        binding.plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            binding.result.setText(old)
        }


    }
}
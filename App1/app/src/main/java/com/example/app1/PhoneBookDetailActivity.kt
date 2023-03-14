package com.example.app1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityPhoneBookDetailBinding

class PhoneBookDetailActivity : AppCompatActivity() {
    private val binding by lazy { ActivityPhoneBookDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getPersonInfoAndDraw()

        binding.back.setOnClickListener {
            onBackPressed()
        }
    }


    fun getPersonInfoAndDraw() {
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")
        binding.personDetailName.setText(name)
        binding.personDetailNumber.setText(number)

    }
}
package com.example.app1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityIntent2Binding

class intent2 : AppCompatActivity() {
    private val binding by lazy { ActivityIntent2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.result.setOnClickListener {

            val number1 = intent.getIntExtra("number1", 0)
            val number2: Int = intent.getIntExtra("number2", 0)

            Log.d("number", "" + number1)
            Log.d("number2", "" + number2)

            val result = number1 + number2

            val resultIntent = Intent()
            resultIntent.putExtra("result", result)

            setResult(Activity.RESULT_OK, resultIntent)
            finish() // 액티비티 종료, 스택이라 intent2가 사라짐
        }

    }

}
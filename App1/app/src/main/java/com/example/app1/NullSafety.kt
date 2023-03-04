package com.example.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class NullSafety : AppCompatActivity() {


    lateinit var lateCar: Car

    class Car(var number: Int) {

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)


        val number: Int = 10
        val number1: Int? = null


//        val number3 = number1? + number0
        val number3 = number1?.plus(number)
//        Log.d("number", "number3 : " + number3)

//        삼항 연산자 -> 엘비스 연산자(?:)
//        Null safety를 위한 도구
        val number4 = number1 ?: 10
//        Log.d("number", "number4 : " + number4)

        lateCar = Car(10)
        Log.d("number", "late number: " +lateCar.number )

    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}
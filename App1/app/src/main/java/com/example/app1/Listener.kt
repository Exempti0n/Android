package com.example.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityListenerBinding

class Listener : AppCompatActivity() {
    private val binding by lazy { ActivityListenerBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
// 뷰를 액티비티로 가져오는 방법
//        1 직접 찾아서 가져온다
//        val textView : TextView = findViewById(R.id.hello)
//        textView.setOnClickListener {
//            Log.d("click", "Click!!")
//        }
//        2 xml을 import해서 가져온다 viewBinding


//        익명함수
//        1 -> 람다
        binding.hello.setOnClickListener {
            Log.d("click", "Click!")
        }
////        2 -> 익명 함수 방식
//        binding.hello.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//                Log.d("click", "Click!")
//            }
//        })
////        3 -> 이름이 필요한 경우(click)
//        val click = object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//            }
//        }
//        binding.hello.setOnClickListener(click)


    }
}
package com.example.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityListenerBinding

class Listener : AppCompatActivity() {
    var number = 10
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
            binding.hello.setText("안녕하세요")
            binding.image.setImageResource(R.drawable.messi)
            number += 10
            Log.d("number", "" + number)// string + 다른 자료형 = 스트링타입

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
//        리스너 단 것은 제일 마지막 것이 적용된다.

//        뷰를 조작하는 함수들
//       1> setText
//       2> setImageResource
    //    xml에 그리는 뷰는 정적이다. 동적으로 바꾸고 싶을 때는 xml을 액티비티로 가져와서
//        바꾼다.
//


    }
}
package com.example.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.app1.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private val binding by lazy { ActivityFragmentBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d("life_cycle", "onCreate")

        binding.button.setOnClickListener {
            //프라그먼트를 동적으로 작동하는 방법
            val fragmentOne : FragmentOne = FragmentOne()
            val fragmentManager :FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction() //시작
            fragmentTransaction.replace(R.id.container, fragmentOne) // 할 일
            fragmentTransaction.commit() //끝
            //끝을 내는 방법
            // commit       -> 시간 될 때 해 (좀 더 안정적)
            // commitnow    -> 지금 당장 해

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }
}
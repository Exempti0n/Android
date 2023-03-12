package com.example.app1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityThreadBinding

class ThreadActivity : AppCompatActivity() {
    private val binding by lazy { ActivityThreadBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread: Thread = Thread(runnable)
        //메인 쓰레드에서 시작하는 순간 실행됨

        binding.button.setOnClickListener {
            thread.start()
        }

        Thread(object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1", "Thread3 is made")

            runOnUiThread { //메인스레드에서 돌아감
                binding.button.setBackgroundColor(getColor(R.color.textview_color)) //UI는 메인스레드만 할 수있다.
            }

        }).start()


    }
}
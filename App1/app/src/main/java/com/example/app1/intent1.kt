package com.example.app1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityIntentBinding

class intent1 : AppCompatActivity() {
    private val binding by lazy { ActivityIntentBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.changeActivity.setOnClickListener {

            val intent = Intent(this@intent1, intent2::class.java)

//            Key, Value 방식 -> Key와 Value를 쌍으로 만들어 저장한다. -> 딕셔너리
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)


//            val intent2 = Intent(this@intent1, intent2::class.java)
//            intent2.apply {
//                this.putExtra("number1", 1) //-> intent2.putExtra
//                this.putExtra("number2", 1)
//            }

//            startActivityForResult(intent2, 200)
//            위 두 코드는 동일하다
//            apply -> apply앞에 있는 것에 적용한다는 뜻.
//            intent에 작업한 것을 한 눈에 알아볼 수 있음.

//            암시적 인텐트
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent3)

        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == 200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "" + result)
        }
        super.onActivityResult(requestCode, resultCode, data) // deprecated
    }
}
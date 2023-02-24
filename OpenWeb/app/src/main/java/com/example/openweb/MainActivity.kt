package com.example.openweb

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.example.openweb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.open.setOnClickListener {
            val adress = binding.adressEditText.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(adress))
            startActivity(intent)
        }

        binding.adressEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit", "beforeTextChanged : " + s)
                Log.d("edit", "" + start)
                Log.d("edit", "" + count)
                Log.d("edit", "" + after)

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit", "onTextChanged : " + s)
                Log.d("edit", "" + start)
                Log.d("edit", "" + before)
                Log.d("edit", "" + count)
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString() == "abc") {
                    Log.d("edit", "text is abc")
                }
                Log.d("edit", "afterTextChanged : " + s)
            }
        })

    }
}
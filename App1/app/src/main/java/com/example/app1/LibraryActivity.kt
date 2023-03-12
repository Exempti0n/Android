package com.example.app1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.app1.databinding.ActivityLibraryBinding

class LibraryActivity : AppCompatActivity() {
    private val binding by lazy { ActivityLibraryBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        Glide.with(this@LibraryActivity)
            .load("https://pbs.twimg.com/media/Fo0CQVeacAAuLmz?format=jpg&name=4096x4096")
            .centerCrop()
            .into(binding.glide)

        Glide.with(this@LibraryActivity)
            .load("https://pbs.twimg.com/media/Fo0CQVeacAAuLmz?format=jpg&name=4096x4096")
            .into(binding.glide2)
    }
}
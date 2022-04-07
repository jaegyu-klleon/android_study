package com.example.ch6_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch6_view.databinding.ConstraintlayoutExamBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = ConstraintlayoutExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button.setOnClickListener {
//            Log.d("태그", "진짜 실행되는지")
//            binding.button.visibility = View.INVISIBLE
//            binding.image.visibility = View.VISIBLE
//        }
//
//        binding.image.setOnClickListener {
//            binding.button.visibility = View.VISIBLE
//            binding.image.visibility = View.INVISIBLE
//        }


    }
}
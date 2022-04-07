package com.example.resourceexam

import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.resourceexam.databinding.MessengerBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val binding = ActivityMainBinding.inflate(layoutInflater)
//        val txtData1: String = getString(R.string.txt_data1)
//        Log.d("res123", txtData1)
        val binding = MessengerBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.tv1.text = txtData1
//
//        binding.tv2.text = "테스트 텍스트뷰 2번"
//        binding.tv2.setBackgroundResource(R.color.primary)
////        binding.tv2.setTextColor(R.color.gray_100)
////        binding.tv2.textColors = getTextColors()
//        binding.tv2.setTextColor(ResourcesCompat.getColor(resources, R.color.yellow, null))
////        binding.tv2.textSize = getString(R.dimen.test_1)
////        binding.tv2.textSize = R.dimen.test_1
////        binding.tv2.textSize = resources
//        binding.tv2.textSize = resources.getDimension(R.dimen.test_1)


        val requestPermissionLauncher =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
                if (isGranted) {
                    Log.d("10장", "callback, granted")
                } else {
                    Log.d("10장", "callback, denied")
                }
            }
    }
}
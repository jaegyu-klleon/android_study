package com.example.eventexam

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eventexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var initTime: Long = 0
    var pauseTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            Log.d("abcde", "Start button click")

            binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            binding.chronometer.start()

            binding.startButton.isEnabled = false
            binding.stopButton.isEnabled = true
            binding.resetButton.isEnabled = true
        }
        binding.stopButton.setOnClickListener {
            Log.d("abcde", "Stop button click")

            pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
            binding.chronometer.stop()

            binding.startButton.isEnabled = true
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = true
        }
        binding.resetButton.setOnClickListener {
            Log.d("abcde", "Start button click")
            pauseTime = 0
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()

            binding.startButton.isEnabled = true
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = false
        }

        binding.test.setOnClickListener {
            Log.d("abcde", "${SystemClock.elapsedRealtime()}")
        }
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode === KeyEvent.KEYCODE_BACK) {
            Log.d("abcde", "currentTimeMillis: ${System.currentTimeMillis()}")
            Log.d("abcde", "initTime: ${initTime}")
            Log.d(
                "abcde",
                "SystemClock.elapsedRealtime() - initTime : ${System.currentTimeMillis() - initTime}"
            )
            if (System.currentTimeMillis() - initTime > 3000) {
                Toast.makeText(this, "종료하려면 한 번 더 누르세요!", Toast.LENGTH_SHORT).show()
                initTime = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }

}
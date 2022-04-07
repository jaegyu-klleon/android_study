package com.example.basic_app

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.DatePicker
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.basic_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestPermissionLauncher: ActivityResultLauncher<String> =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
                if (isGranted) {
                    Log.d("10장", "callback, granted..")
                } else {
                    Log.d("10장", "callback, denied..")
                }
            }

        requestPermissionLauncher.launch("android.permission.ACCESS_FINE_LOCATION")

        binding.button.setOnClickListener {
            Log.d("yeahh", "button click")
//            simpleToast("토스트 띄우기")
//            simpleToast("set으로 띄우는 토스트")

//            showToast()
            selectDate()
        }

//        val toast = Toast.makeText(this, "set함수로 만든 토스트", Toast.LENGTH_SHORT)


    }

    val simpleToast = { text: String ->
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)

        toast.setGravity(Gravity.LEFT, 200, 200)
        toast.duration = Toast.LENGTH_LONG
//        toast.setMargin(30f, 40f)
//        toast.setText("qwf")

        toast.show()
    }

    private fun showToast() {
        val toast = Toast.makeText(this, "종료하려면 한 번 더 누르세요.", Toast.LENGTH_SHORT)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            toast.addCallback(object : Toast.Callback() {
                override fun onToastShown() {
                    Log.d("yeahh", "토스트 나왔다")
                    super.onToastShown()
                }

                override fun onToastHidden() {
                    Log.d("yeahh", "토스트 들어갔다")
                    super.onToastShown()
                }
            })
        }
        toast.show()
    }

    fun selectDate() {
        val datapicker = DatePickerDialog(
            this,
            { p0: DatePicker?, p1: Int, p2: Int, p3: Int ->
                Log.d(
                    "yeahh",
                    "year: $p1, month: ${p2 + 1}, dayOfMonth: $p3"
                )
            },
            2022,
            0,
            4
        )
//        DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
//            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
//            }
//        }, 2022,0,1)

        datapicker.show()
    }

}
package com.example.latte

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.latte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // id값으로 뷰 객체 획득
//        val textView1: TextView = findViewById(R.id.title)
//        val textView2: TextView = findViewById<TextView>(R.id.title)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }

        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }

//        fun createBtn(): CompoundButton.OnCheckedChangeListener {
//
//            return
//        }

        val a = CompoundButton.OnCheckedChangeListener { p1, p2 -> println() }

        binding.checkbox.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {

            }
        })

//        // 이름 문자열 출력 TextView 생성
//        val name = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "Lake Louise"
//        }
//
//        // 이미지 출력 ImageView 생성
//        val image = ImageView(this).also {
//            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog1))
//        }
//
//        // 주소 문자열 출력 TextView 생성
//        val address = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "Lake Louise, AB, Canada"
//        }
//        val layout = LinearLayout(this).apply {
//            orientation = LinearLayout.VERTICAL
//            gravity = Gravity.CENTER
//            // LinearLayout 객체에 위에 만든것 추가
//            addView(name, WRAP_CONTENT, WRAP_CONTENT)
//            addView(image, WRAP_CONTENT, WRAP_CONTENT)
//            addView(address, WRAP_CONTENT, WRAP_CONTENT)
//        }
//
//        setContentView(layout)


    }
}



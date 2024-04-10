package com.example.viewmodel_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel : MViewModel

    lateinit var textView: TextView
    lateinit var minusButton: Button
    lateinit var plusButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 뷰모델 초기화
        mViewModel = ViewModelProvider(this).get(MViewModel::class.java)

        // 뷰 초기화
        textView = findViewById(R.id.textView)
        minusButton = findViewById(R.id.minusButton)
        plusButton = findViewById(R.id.plusButton)

        // 텍스트뷰의 텍스트 값 초기화
        textView.text = mViewModel.result.toString()

        // 더하기 버튼 클릭 리스너
        plusButton.setOnClickListener {

            textView.text = mViewModel.plus().toString()

        }

        // 빼기 버튼 클릭 리스너
        minusButton.setOnClickListener {

            textView.text = mViewModel.minus().toString()

        }

    }

}
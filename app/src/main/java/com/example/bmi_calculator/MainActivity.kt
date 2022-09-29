package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val height = findViewById<View>(R.id.etHeight) as EditText
        val weight = findViewById<View>(R.id.etWeight) as EditText
       val bmi = findViewById<View>(R.id.tvBMI) as TextView
        val btnCalculate = findViewById<View>(R.id.btnCalculate) as Button

        btnCalculate.setOnClickListener(View.OnClickListener {

            bmi.text=("Your BMI Is: " +  (weight.text.toString().toFloat() * 703) / (height.text.toString().toFloat() * height.text.toString().toFloat()))
        })






    }
}
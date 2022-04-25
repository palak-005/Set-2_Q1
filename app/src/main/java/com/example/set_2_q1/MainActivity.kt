package com.example.set_2_q1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            var num1 = edtNum1.text.toString().toInt()
            var num2 = edtNum2.text.toString().toInt()
            var total = 0
            if(num1.coerceAtMost(2).equals(2) && num2.coerceAtMost(2).equals(2)){
                total = num1 + num2
                Toast.makeText(this,"Total is $total",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Please Enter atleast 2 digit",Toast.LENGTH_LONG).show()
            }
        }
    }
}
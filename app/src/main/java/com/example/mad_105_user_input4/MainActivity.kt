package com.example.mad_105_user_input4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    var restBill: Double = 0.00
    var tipPercent: Double = 0.00
    var tipCalc: Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bill: EditText = findViewById(R.id.txtRestBill)
        val group: Spinner = findViewById(R.id.spnGroup)
        val calculate: Button = findViewById(R.id.btnCalculate)
        val tip: TextView = findViewById(R.id.tipCalculated)

        calculate.setOnClickListener {
            restBill = bill.text.toString().toDouble()
            tipPercent = group.selectedItem.toString().toDouble()
            val currency = DecimalFormat ( "$#,###.00")
            tipCalc = restBill * tipPercent / 100
//            tipCalc = restBill * 0.10
            val tipCalcFormat = currency.format(tipCalc)

            tip.text = "Tip value:  $tipCalcFormat"

        }
    }
}
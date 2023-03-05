package com.example.convertidora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class temperatura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperatura)

        var c = 100
        var mili = 1000
        var deci = 10
        var Ki = 0.001

        val Con = findViewById<View>(R.id.convertir) as Button



        Con.setOnClickListener {
            val t = findViewById<View>(R.id.txttemperatura) as TextView
            val temp = t.text.toString().toDouble()

            val R1 = findViewById<View>(R.id.fah) as RadioButton
            val R2 = findViewById<View>(R.id.kelvin) as RadioButton



            if (R1.isChecked) {
                val Mi: Double = temp * 1.8 + 32
                val R1 = findViewById<View>(R.id.txtresulttemp) as TextView
                R1.setText(Mi.toString())

            } else if (R2.isChecked) {
                val CE: Double = temp + 273.15
                val R2 = findViewById<View>(R.id.txtresulttemp) as TextView
                R2.setText(CE.toString())

            }
        }
    }
}
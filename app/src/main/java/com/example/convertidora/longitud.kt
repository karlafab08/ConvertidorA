package com.example.convertidora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class longitud : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_longitud)

        var c = 100
        var mili = 1000
        var deci = 10
        var Ki = 0.001

        val Con = findViewById<View>(R.id.convertir) as Button



        Con.setOnClickListener {
            val M = findViewById<View>(R.id.txtmetros) as TextView
            val Mts = M.text.toString().toDouble()

            val R1 = findViewById<View>(R.id.milimetros) as RadioButton
            val R2 = findViewById<View>(R.id.centimetros) as RadioButton
            val R3 = findViewById<View>(R.id.decimetros) as RadioButton
            val R4 = findViewById<View>(R.id.kilometros) as RadioButton


            if (R1.isChecked) {
                val Mi: Double = Mts * mili
                val R1 = findViewById<View>(R.id.txtresult) as TextView
                R1.setText(Mi.toString())

            } else if (R2.isChecked) {
                val CE: Double = Mts * c
                val R2 = findViewById<View>(R.id.txtresult) as TextView
                R2.setText(CE.toString())

            } else if (R3.isChecked) {
                val dec: Double = Mts * deci
                val R3 = findViewById<View>(R.id.txtresult) as TextView
                R3.setText(dec.toString())

            } else if (R4.isChecked) {
                val kilo: Double = Mts * Ki
                val R4 = findViewById<View>(R.id.txtresult) as TextView
                R4.setText(kilo.toString())
            }
        }

    }


}


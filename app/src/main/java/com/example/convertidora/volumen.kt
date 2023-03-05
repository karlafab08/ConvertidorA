package com.example.convertidora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class volumen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volumen)
        var mili = 1000
        var galon = 0.264172
        var meCu = 0.001
        var pieCu = 0.0353147

        val Con = findViewById<View>(R.id.convertir) as Button



        Con.setOnClickListener {
            val M = findViewById<View>(R.id.txtvolumen) as TextView
            val Mts = M.text.toString().toDouble()

            val R1 = findViewById<View>(R.id.mili) as RadioButton
            val R2 = findViewById<View>(R.id.galo) as RadioButton
            val R3 = findViewById<View>(R.id.metroCu) as RadioButton
            val R4 = findViewById<View>(R.id.pieCu) as RadioButton


            if (R1.isChecked) {
                val Mi: Double = Mts * mili
                val R1 = findViewById<View>(R.id.txtresultvolumen) as TextView
                R1.setText(Mi.toString())

            } else if (R2.isChecked) {
                val CE: Double = Mts * galon
                val R2 = findViewById<View>(R.id.txtresultvolumen) as TextView
                R2.setText(CE.toString())

            } else if (R3.isChecked) {
                val dec: Double = Mts * meCu
                val R3 = findViewById<View>(R.id.txtresultvolumen) as TextView
                R3.setText(dec.toString())

            } else if (R4.isChecked) {
                val kilo: Double = Mts * pieCu
                val R4 = findViewById<View>(R.id.txtresultvolumen) as TextView
                R4.setText(kilo.toString())
            }
        }

    }
}
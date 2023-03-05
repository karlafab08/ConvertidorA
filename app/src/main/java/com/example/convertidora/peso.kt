package com.example.convertidora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class peso : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peso)

        var gr = 1000
        var onza = 35.274
        var libra = 2.204
        var tone = 0.001

        val Con = findViewById<View>(R.id.convertir) as Button



        Con.setOnClickListener {
            val M = findViewById<View>(R.id.txtpeso) as TextView
            val Mts = M.text.toString().toDouble()

            val R1 = findViewById<View>(R.id.libra) as RadioButton
            val R2 = findViewById<View>(R.id.gramos) as RadioButton
            val R3 = findViewById<View>(R.id.tonelada) as RadioButton
            val R4 = findViewById<View>(R.id.onza) as RadioButton


            if (R1.isChecked) {
                val Mi: Double = Mts * libra
                val R1 = findViewById<View>(R.id.txtresultpeso) as TextView
                R1.setText(Mi.toString())

            } else if (R2.isChecked) {
                val CE: Double = Mts * gr
                val R2 = findViewById<View>(R.id.txtresultpeso) as TextView
                R2.setText(CE.toString())

            } else if (R3.isChecked) {
                val dec: Double = Mts * tone
                val R3 = findViewById<View>(R.id.txtresultpeso) as TextView
                R3.setText(dec.toString())

            } else if (R4.isChecked) {
                val kilo: Double = Mts * onza
                val R4 = findViewById<View>(R.id.txtresultpeso) as TextView
                R4.setText(kilo.toString())
            }
        }
    }
}
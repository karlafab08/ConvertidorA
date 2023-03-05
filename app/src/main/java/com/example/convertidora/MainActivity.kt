package com.example.convertidora

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Enviar1 = findViewById<View>(R.id.entrar2) as Button

        Enviar1.setOnClickListener {
            val R1 = findViewById<View>(R.id.radio1) as RadioButton
            val R2 = findViewById<View>(R.id.radio2) as RadioButton
            val R3 = findViewById<View>(R.id.radio3) as RadioButton
            val R4 = findViewById<View>(R.id.radio4) as RadioButton

            if (R1.isChecked) {
                val longitud1 = Intent(this@MainActivity, longitud:: class.java)
                startActivity(longitud1)
            } else if (R2.isChecked) {
                val peso1 = Intent(this@MainActivity, peso:: class.java)
                startActivity(peso1)
            }else if (R3.isChecked){
                val volumen1 = Intent(this@MainActivity, volumen:: class.java)
                startActivity(volumen1)
            }else if (R4.isChecked){
                val temperatura1 = Intent(this@MainActivity, temperatura:: class.java)
                startActivity(temperatura1)
            }
        }

    }
}
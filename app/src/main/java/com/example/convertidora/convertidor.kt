package com.example.convertidora

class convertidor {
    var m: Double private set
    var c: Double private set
    private var mili = 0.0
    private var deci = 0.0
    private var Ki = 0.0

    constructor(M: Double) {
        m = M
        c = 100.0
        mili = 1000.0
        deci = 10.0
        Ki = 0.001
    }

    constructor(obj: convertidor) {
        m = obj.m
        c = obj.c
    }

    override fun toString(): String {
        return " =" + m
    }

    fun Centimetros(A: convertidor?): convertidor {
        val CE = m * c
        return convertidor(CE)
    }

    fun Milimetros(A: convertidor?): convertidor {
        val Mi = m * mili
        return convertidor(Mi)
    }

    fun Decimetros(A: convertidor?): convertidor {
        val dec = m * deci
        return convertidor(dec)
    }

    fun Kilometros(A: convertidor?): convertidor {
        val kilo = m * Ki
        return convertidor(kilo)
    }
}

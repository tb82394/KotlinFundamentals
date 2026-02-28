package com.example.lib.oop

import kotlin.math.pow

interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

}

class Circulo(private val radio: Double) : Figura {
    override fun calcularArea(): Double {
        return (Math.PI * radio.pow(2))
    }

    override fun calcularPerimetro(): Double {
        return (2 * Math.PI * radio)
    }

}

fun main() {
    val rect = Rectangulo(5.0, 3.0)
    val circ = Circulo(4.0)

    println("Rectangulo - Area: $%.2f, Perimetro: $%.2f".format(rect.calcularArea(), rect.calcularPerimetro()))
    println("Circulo - Area: $%.2f, Perimetro: $%.2f".format(circ.calcularArea(), circ.calcularPerimetro()))
}



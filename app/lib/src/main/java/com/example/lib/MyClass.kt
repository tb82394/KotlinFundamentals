package com.example.lib

import kotlin.math.cos

class MyClass {
}

fun main(){
    val name : String = "Thomas"
    var age : Int = 18
    age = 19

//    for (i in 100 downTo 0 step 10) {
//        println(i)
//    }

    // Calculadora de propinas
    /*
    Crea un programa que tenga un precio de comida y un porcentaje de propina, el programa debe imprimir
    cuanto es de propina y cuanto es el total a pagar
     */

    val cost = 500;
    val percentage = 0.15;

    val tip = cost * percentage;
    val total = cost + tip

    println("El costo es: $cost")
    println("El porcentaje es: $percentage")
    println("La propina es: $tip")
    println("El total es: $total")


}
package com.example.lib

fun main() {
    /*
    Dada una lista de numeros desordenados imprime cual es el nuemro mas grande sin usar la fn max
     */

    val numbers = arrayOf(451,2,3,4,5,10,452,67);
    var highestVal = numbers.get(0);
    for (i in numbers) {
        if (i > highestVal) {
            highestVal = i;
        } else {
            continue
        }
    }
    println(highestVal)
}
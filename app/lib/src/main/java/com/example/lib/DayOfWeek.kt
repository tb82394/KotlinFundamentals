package com.example.lib

/*
 Escribir un programa que me muestre en consola los dias de la semana y si es sabado o domingo que
 escriba fin de semana
 */
fun main() {
    val dayOfTheWeek = 2;

    var res = when (dayOfTheWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6,7 -> "Weekend"
        else -> "Invalid day."
    }

    println("Today is: $res")
}
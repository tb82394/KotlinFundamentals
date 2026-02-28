package com.example.lib.oop

class Persona(private var nombre: String, private var edad: Int, private var ciudad: String) {

    fun saludar(){
        println("Hola me llamo $nombre, tengo $edad annos y soy de $ciudad")
    }

    fun esMayorDeEdad() : Boolean {
        if (edad >= 18) {
            return true
        } else {
            return false
        }
    }


}
fun main(){
    val p1 = Persona("Ana", 20, "Guadalajara")
    val p2 = Persona("Luis", 15, "Leon")

    p1.saludar()
    println("Ana es mayor de edad = " + p1.esMayorDeEdad())
    p2.saludar()
    println("Luis es mayor de edad = " + p2.esMayorDeEdad())

}
package com.example.lib.oop

open class Animal(private var nombre : String, private var edad : Int) {

    open fun hacerSonido() {
        println("Sonido Generico")
    }

    fun describirse() {
        println("Soy $nombre y tengo $edad anhos")
    }

}

class Perro(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println("Guau!")
    }
}

class Gato(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println("Meow!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        print("Mooo!")
    }
}

fun main(){
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()

    val gato = Gato("Tobias", 2)
    gato.describirse()
    gato.hacerSonido()

    val vaca = Vaca("Daisy", 4)
    vaca.describirse()
    vaca.hacerSonido()
}
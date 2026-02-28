package com.example.lib.oop

abstract class Vehiculo(private var marca: String, private var velocidadMaxima: Int) {
    abstract fun tipoVehiculo(): String

    fun mostrarInfo(){
        println("${tipoVehiculo()}: $marca - Vel. max = $velocidadMaxima km/h")
    }

}

class Auto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Auto"

}

class Moto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Moto"

}

class Camion(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Camion"

}

fun main() {
    val vehiculos = listOf<Vehiculo>(Auto("Toyota", 180), Moto("Honda", 220), Camion("Volvo", 120))

    for (v in vehiculos) {
        v.mostrarInfo()
    }
}
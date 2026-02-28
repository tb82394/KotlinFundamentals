package com.example.lib.oop

class CuentaBancaria(private var titular : String) {
    private var saldo = 0.0

    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Nuevo saldo = $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad > saldo) {
            println("ERROR, no hay suficiente saldo")
        } else {
            saldo -= cantidad
        }
    }

    fun mostrarSaldo() {
        println("Titular: $titular / Saldo = $$saldo")
    }
}

fun main() {
    val cuenta = CuentaBancaria("Maria Garcia")
    cuenta.depositar(1000.00)
    cuenta.retirar(400.00)
    cuenta.retirar(800.00)
    cuenta.mostrarSaldo()

}
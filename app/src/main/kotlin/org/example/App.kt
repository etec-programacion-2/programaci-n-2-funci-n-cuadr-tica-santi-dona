package org.example



fun main() {
    // Definir los coeficientes como constantes
    val a = 1.0
    val b = -3.0
    val c = 2.0

    // Validar que 'a' no sea cero
    if (a == 0.0) {
        println("El coeficiente 'a' no puede ser cero en una función cuadrática.")
        return
    }

    // Mostrar la función en formato ax² + bx + c
    println("La función cuadrática es: ${a}x² + ${b}x + ${c}")
}

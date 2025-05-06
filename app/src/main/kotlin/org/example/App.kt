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

    // Etapa 2 
    fun calcularFuncionCuadratica(x: Double, a: Double, b: Double, c: Double): Double {
        return a * x * x + b * x + c
    }
    // Mostrar tabla de valores para un rango de x
    println("Tabla de valores:")
    println("x\tf(x)")
    for (x in -5..5) {
        val fx = calcularFuncionCuadratica(x.toDouble(), a, b, c)
        println("$x\t$fx")
    }

    // Etapa 3
    // Calcular el discriminante
    val discriminante = b * b - 4 * a * c

    // Determinar y mostrar las raíces según el discriminante
    if (discriminante > 0) {
        println("La ecuación tiene dos soluciones reales diferentes.")
        val raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a)
        val raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a)
        println("Raíz 1: %.2f".format(raiz1))
        println("Raíz 2: %.2f".format(raiz2))
    } 
    else if (discriminante == 0.0) {
        println("La ecuación tiene una solución real doble.")
        val raizUnica = -b / (2 * a)
        println("Raíz única: %.2f".format(raizUnica))
    } 
    else {
        println("La ecuación no tiene soluciones reales.")
    }
}

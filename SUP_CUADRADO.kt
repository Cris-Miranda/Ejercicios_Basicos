package PRACTICA

fun main() {
    print("Ingresa el valor del lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null && lado > 0) {
        val superficie = lado * lado
        println("La superficie del cuadrado es: $superficie")
    } else {
        println("Por favor, ingresa un valor válido y mayor a 0.")
    }
}

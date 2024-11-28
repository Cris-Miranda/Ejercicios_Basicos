package PRACTICA

fun main() {
    val claveCorrecta = "TESJI123"

    print("Ingresa la clave para acceder a la aplicación: ")
    val claveIngresada = readLine()

    if (claveIngresada == claveCorrecta) {
        println("Clave correcta. Puedes entrar a la aplicación.")
    } else {
        println("Clave incorrecta. No puedes entrar a la aplicación.")
    }
}

fun main() {
       print("Ingresa tu peso en kilogramos (kg): ")
    val peso = readLine()?.toDoubleOrNull()

    print("Ingresa tu estatura en metros (m): ")
    val estatura = readLine()?.toDoubleOrNull()

    if (peso != null && peso > 0 && estatura != null && estatura > 0) {
        val imc = peso / (estatura * estatura)
        println("Tu Índice de Masa Corporal (IMC) es: %.2f".format(imc))
    }else{
        println("Por favor, ingresa valores válidos para el peso y la estatura.")
    }
}

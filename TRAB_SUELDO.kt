package PRACTICA

fun main() {
    for (i in 1..3) {
        println("=== Trabajador $i ===")

        print("Ingresa los días trabajados: ")
        val diasTrabajados = readLine()?.toIntOrNull()

        print("Ingresa el pago por hora: ")
        val pagoPorHora = readLine()?.toDoubleOrNull()

        print("Ingresa el pago por hora extra: ")
        val pagoPorHoraExtra = readLine()?.toDoubleOrNull()

        var horasExtras: Int? = null

        while (horasExtras == null || horasExtras > 5) {
            print("Ingresa la cantidad de horas extras trabajadas (máximo 5): ")
            horasExtras = readLine()?.toIntOrNull()
            if (horasExtras == null || horasExtras < 0 || horasExtras > 5) {
                println("Número inválido. Inténtalo nuevamente.")
                horasExtras = null
            }
        }

        if (diasTrabajados != null && diasTrabajados > 0 &&
            pagoPorHora != null && pagoPorHora > 0 &&
            pagoPorHoraExtra != null && pagoPorHoraExtra > 0
        ) {
            val sueldoBase = diasTrabajados * 8 * pagoPorHora
            val sueldoHorasExtras = horasExtras * pagoPorHoraExtra
            val sueldoTotal = sueldoBase + sueldoHorasExtras
            println("El sueldo total del trabajador $i es: $sueldoTotal")
        } else {
            println("Datos inválidos.")
        }
    }
}

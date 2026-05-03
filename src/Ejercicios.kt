
// Ejercicio 1 - El control de gastos diarios
fun reto1() {
    val gastos = arrayOf(62.0, 14.5, 60.0, 89.0, 16.0, 5.0, 150.0, 25.0, 15.0, 40.0, 60.0, 5.0, 70.0, 10.0, 53.0)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > max) max = gasto
        if (gasto < min) min = gasto
    }
    val promedio = total / gastos.size

    println("Ejercicio 1: El control de gastos")
    println("Total: $total, Promedio: $promedio, Máximo: $max, Mínimo: $min")
}


// Ejercicio 2 - El filtro de empleados senior
fun reto2() {
    val empleados = listOf("Andres" to 25, "Sebastian" to 35, "Liliana" to 42, "Samuel" to 28, "Karen" to 31)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("Ejercicio 2: El filtro senior")
    println("Empleados Senior: $seniorNames")
}

// Ejercicio 3 - Limpieza de Contactos Duplicados
fun reto3() {
    val contactos = listOf("300498", "387496", "351749", "373598", "351098", "374888", "309875")
    val unicos = contactos.toSet().sorted()

    println("Ejercicio 3: Limpiar la agenda")
    println("Contactos únicos ordenados: $unicos")
}

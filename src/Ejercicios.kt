
// Ejercicio 1 - control de gastos diarios
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


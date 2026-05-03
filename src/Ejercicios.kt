
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
    val empleados = listOf("Andres" to 22, "Sebastian" to 38, "Liliana" to 41, "Samuel" to 20, "Karen" to 35)
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


// Ejercicio 4 - Análisis de Carrito de Compras
fun reto4() {
    val carrito = listOf("Galletas", "Pan tajado", "Galletas", "Quesito", "Pan tajado", "Galletas", "Leche")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }

    println("Reto 4: El Carrito de Compras")
    println("Conteo: $conteo")
}

// Ejercicio 5 - Historial de Navegación Reversible
fun reto5() {
    val historial = arrayOf("firebase.com", "github.com", "androidstudio.org", "stackoverflow.com", "nextjs.com")
    val invertido = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertido[i] = historial[historial.size - 1 - i]
    }

    println("Reto 5: El Historial Reversible")
    println("Original: ${historial.joinToString()}")
    println("Invertido: ${invertido.joinToString()}")
}

// Ejercicio 6 - Compatibilidad de Intereses (Match)
fun reto6() {
    val interesesP1 = setOf("Futbol", "Música", "Paseos", "Juegos")
    val interesesP2 = setOf("Música", "Natacion", "Viajes", "Pintar")

    val comunes = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)

    println("Reto 6: El Match de Intereses")
    println("Comunes: $comunes")
    println("Solo Persona 1: $exclusivosP1")
}


// Ejercicio 7 - Inventario de Despensa
fun reto7() {
    val despensa = mutableMapOf("Café" to 8, "Azúcar" to 4, "Pasta" to 3)

    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        if (actual > 0) {
            val nuevo = actual - cantidad
            if (nuevo <= 0) {
                despensa.remove(producto)
                println("¡Alerta! $producto se ha agotado.")
            } else {
                despensa[producto] = nuevo
            }
        }
    }

    println("Reto 7: El Inventario Despensa")
    println("Inicial: $despensa")
    consumir("Pasta", 3)
    consumir("Café", 2)
    println("Final: $despensa")
}

// Ejercicio 8 - Cálculo de Promedio Académico
fun reto8() {
    val notas = listOf(3.5 to 0.15, 4.2 to 0.35, 3.9 to 0.5)
    var notaFinal = 0.0
    for (par in notas) {
        notaFinal += par.first * par.second
    }

    println("Reto 8: Promedio Académico")
    println("Nota Final: $notaFinal")
}

// Ejercicio 9 - Traductor de Códigos de País
fun reto9() {
    val paises = mapOf("BR" to "Brasil", "FR" to "Francia", "JP" to "Japón", "CA" to "Canadá")

    println("Reto 9: Traductor de Países")
    for ((codigo, nombre) in paises) {
        println("El código [$codigo] pertenece a [$nombre]")
    }
}

// Ejercicio 10 - Rotación de Turnos de Trabajo
fun reto10() {
    val empleados = listOf("Emp4", "Emp7", "Emp1", "Emp5", "Emp2", "Emp6", "Emp3")
    val k = 4
    val rotada = mutableListOf<String>()
    for (i in empleados.indices) {
        rotada.add(empleados[(i + k) % empleados.size])
    }

    println("Reto 10: Rotación de Turnos")
    println("Original: $empleados")
    println("Rotada (k=$k): $rotada")
}
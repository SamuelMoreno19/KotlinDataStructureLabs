
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

// Ejercicio 11 - Organizador de Maleta
fun reto11() {
    val objetos = listOf("Cargador" to 1, "Abrigo" to 3, "Botella" to 2, "Audífonos" to 1, "Botiquín" to 2)
    val porPeso = mutableMapOf<Int, MutableList<String>>()

    for (obj in objetos) {
        porPeso.getOrPut(obj.second) { mutableListOf() }.add(obj.first)
    }

    println("Reto 11: Organizador de Maleta")
    println("Objetos por peso: $porPeso")
}

// Ejercicio 12 - Verificador de Ruta Reversible
fun reto12() {
    val ruta = listOf(5 to 10, 3 to 3, 0 to 0, 3 to 3, 5 to 10)
    var esEspejo = true
    for (i in 0 until ruta.size / 2) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esEspejo = false
            break
        }
    }

    println("Reto 12: Ruta Espejo")
    println("¿Es espejo?: $esEspejo")
}

// Ejercicio 13 - Reparto de Pedidos por Camión
fun reto13() {
    val paquetes = (1..40).toList().map { "Paquete #$it" }
    val lotes = paquetes.chunked(8)

    println("Reto 13: Reparto de Pedidos")
    lotes.forEachIndexed { index, lote ->
        println("Camión ${index + 1}: ${lote.size} paquetes")
    }
}

// Ejercicio 14 - Identificador de Ticket Único
fun reto14() {
    val tickets = listOf("TK-500", "TK-600", "TK-500", "TK-700", "TK-600", "TK-800")
    val conteo = tickets.groupingBy { it }.eachCount()
    val unico = tickets.firstOrNull { conteo[it] == 1 }

    println("Reto 14: Ticket Único")
    println("Primer ticket único: $unico")
}

// Ejercicio 15 - Calculadora de IVA Selectiva
fun reto15() {
    val productos = mapOf("Aceite" to 12000.0, "Televisor" to 1200000.0, "Celular" to 850000.0, "Azúcar" to 4500.0)
    val conIVA = productos.mapValues { (_, precio) ->
        if (precio > 100000) precio * 1.19 else precio
    }

    println("Reto 15: IVA Selectivo")
    println("Precios con IVA: $conIVA")
}

// Ejercicio 16 - Mantenimiento de Sensores
fun reto16() {
    val sensores = mutableListOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    sensores.removeAll { it % 4 == 0 }

    println("Reto 16: Mantenimiento de Sensores")
    println("Sensores funcionales: $sensores")
}

// Ejercicio 17 - Mapa de Almacén (Matriz)
fun reto17() {
    val almacen = arrayOf(
        arrayOf(30, 12, 8, 4),
        arrayOf(9, 22, 11, 7),
        arrayOf(15, 6, 18, 2),
        arrayOf(5, 14, 3, 40)
    )
    var principal = 0
    var secundaria = 0
    val n = almacen.size
    for (i in 0 until n) {
        principal += almacen[i][i]
        secundaria += almacen[i][n - 1 - i]
    }

    println("Reto 17: Matriz Almacén")
    println("Suma Principal: $principal, Suma Secundaria: $secundaria")
}

// Ejercicio 18 - Fusión de Recetas
fun reto18() {
    val chef1 = mapOf("Mantequilla" to 150.0, "Levadura" to 20.0, "Leche" to 300.0)
    val chef2 = mapOf("Mantequilla" to 50.0, "Huevo" to 4.0, "Leche" to 100.0)

    val compras = (chef1.keys + chef2.keys).associateWith {
        (chef1[it] ?: 0.0) + (chef2[it] ?: 0.0)
    }

    println("Reto 18: Fusión de Recetas")
    println("Lista de compras: $compras")
}

// Ejercicio 19 - Ranking de Apps por Calificación
fun reto19() {
    val apps = mutableListOf("VideoPro" to 4.7, "GameMaster" to 3.5, "QuickNotes" to 4.1, "CloudRun" to 4.8)
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }

    println("Reto 19: Ranking de Apps")
    println("Top Apps: $apps")
}

// Ejercicio 20 - Unión de Agendas Ordenadas
fun reto20() {
    val agenda1 = listOf("Andrés", "Gabriel", "Samuel")
    val agenda2 = listOf("Bernardo", "Daniela", "Fernando")

    val fusion = mutableListOf<String>()
    var i = 0
    var j = 0

    while (i < agenda1.size && j < agenda2.size) {
        if (agenda1[i] < agenda2[j]) {
            fusion.add(agenda1[i++])
        } else {
            fusion.add(agenda2[j++])
        }
    }
    while (i < agenda1.size) fusion.add(agenda1[i++])
    while (j < agenda2.size) fusion.add(agenda2[j++])

    println("Reto 20: Unión Agendas")
    println("Agenda Fusionada: $fusion")
}

// Ejercicio 21 - Días de Mantenimiento (Primos)
fun reto21() {
    val n = 80
    val esPrimo = BooleanArray(n + 1) { true }
    esPrimo[0] = false
    esPrimo[1] = false
    for (p in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (esPrimo[p]) {
            for (i in p * p..n step p) esPrimo[i] = false
        }
    }
    val pisosPrimos = (1..n).filter { esPrimo[it] }

    println("Reto 21: Pisos Primos")
    println("Pisos con mantenimiento: $pisosPrimos")
}

// Ejercicio 22 - Pila de Platos Sucios
fun reto22() {
    val pila = mutableListOf<String>()
    fun push(plato: String) = pila.add(plato)
    fun pop(): String? = if (pila.isNotEmpty()) pila.removeAt(pila.size - 1) else null

    println("Reto 22: Pila de Platos")
    push("Plato Hondo")
    push("Plato Postre")
    push("Bandeja")
    println("Lavando: ${pop()}")
    println("Pila restante: $pila")
}

// Ejercicio 23 - Seguimiento de Dieta
fun reto23() {
    val calorias = listOf(1987.0, 2800.0, 2300.0, 1950.0, 2050.0)
    val diferencias = mutableListOf<Double>()
    var sumaAnterior = 0.0

    for (i in calorias.indices) {
        if (i == 0) {
            diferencias.add(0.0)
        } else {
            val promedioAnterior = sumaAnterior / i
            diferencias.add(calorias[i] - promedioAnterior)
        }
        sumaAnterior += calorias[i]
    }

    println("Reto 23: Seguimiento Dieta")
    println("Diferencias vs Promedio Anterior: $diferencias")
}

// Ejercicio 24 - Organización de Contenedores
fun reto24() {
    val manifiesto = "((()())())"
    var balance = 0
    var esValido = true
    for (char in manifiesto) {
        if (char == '(') balance++
        else if (char == ')') balance--
        if (balance < 0) {
            esValido = false
            break
        }
    }
    if (balance != 0) esValido = false

    println("Reto 24: Contenedores Balanceados")
    println("Manifiesto: $manifiesto - ¿Válido?: $esValido")
}

// Ejercicio 25 - Rendimiento de Maratón
fun reto25() {
    val tiempos = mutableListOf(135.0, 132.0, 158.0, 128.0, 110.0)
    tiempos.sort()
    tiempos.removeAt(0) // Mínimo
    tiempos.removeAt(tiempos.size - 1) // Máximo
    val promedioReal = tiempos.average()

    println("Reto 25: Rendimiento Maratón")
    println("Promedio sin outliers: $promedioReal")
}

// Ejercicio 26 - Compresión de Logs
fun reto26() {
    val logs = listOf("ACTIVE", "ACTIVE", "ACTIVE", "INACTIVE", "ACTIVE", "INACTIVE", "INACTIVE")
    val comprimido = mutableListOf<Pair<String, Int>>()
    if (logs.isNotEmpty()) {
        var actual = logs[0]
        var cuenta = 0
        for (log in logs) {
            if (log == actual) {
                cuenta++
            } else {
                comprimido.add(actual to cuenta)
                actual = log
                cuenta = 1
            }
        }
        comprimido.add(actual to cuenta)
    }
    println("Reto 26: Compresión Logs")
    println("Resumen: $comprimido")
}

// Ejercicio 27 - Premios a Vendedores
fun reto27() {
    val ventas = mapOf("Roberto" to 11000.0, "Elena" to 16000.0, "Marcos" to 7530.0, "Lucía" to 18000.0)
    val promedio = ventas.values.average()
    val premiados = ventas.filter { it.value > promedio }.keys

    println("Reto 27: Premios Vendedores")
    println("Promedio: $promedio, Premiados: $premiados")
}

// Ejercicio 28 - Calculadora de Tarifas de Parking
fun reto28() {
    val tarifas = (1..10).associateWith { it * 2500.0 }
    val horas = 8
    val costo = tarifas[horas] ?: (horas * 2500.0)

    println("Reto 28: Parking")
    println("Costo por $horas horas: $costo")
}
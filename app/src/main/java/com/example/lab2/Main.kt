package com.example.lab2

fun suma(numbers: List<Int>): Int {
    return numbers.reduce { acc, num -> acc + num }
}

fun main () {
    // Ejercicio 1 - Promedio
    var listaNumeros = listOf<Int>(1, 2, 3, 33)
    val total = suma(listaNumeros)
    val promedio = total.toDouble()/listaNumeros.size
    println("Promedio: " + promedio) // Duda de decimales

    // Ejercicio 2 - Filtrar impares
    val numerosImpares = listaNumeros.filter { it % 2 != 0 }
    println(numerosImpares)

    // Ejercicio 3 - Palíndromo
    val palabra = "aab"
    if (palabra == palabra.reversed()) {
        println("Es palíndromo.")
    } else {
        println("No es palíndromo")
    }

    // Ejercicio 4 - Saludos
    val nombres = listOf("Angel", "Esteban", "Javier", "Diego", "Elena")
    val nombresSaludos = nombres.map {"¡Hola, $it!"}
    println(nombresSaludos)

    // Ejercicio 5 - PerformOperation
    fun performOperation(numbers: List<Int>, operacion: String): Int {
        // Definir las lambdas dentro de la función
        val suma: (List<Int>) -> Int = { list -> list.sum() }
        val resta: (List<Int>) -> Int = { list -> list.fold(numbers[0]) { acc, i -> acc - i } }

        return when (operacion) {
            "suma" -> suma(numbers)
            "resta" -> resta(numbers)
            else -> throw IllegalArgumentException("Operación no soportada: $operacion")
        }
    }

    println(performOperation(listaNumeros, "resta"))

    // Ejercicio 6 - Persona y Estudiante
    data class Person(val name: String, val age: Int, val gender: String)
    data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

    fun mapPerson (persona: Person): Student{
        return Student(persona.name, persona.age, persona.gender, "")
    }

    val persona1 = Person("Diego", 18, "Hombre")
    val estudiante1 = mapPerson(persona1)
    println("El Estudiante ${estudiante1.name} tiene ${estudiante1.age}")
}
package com.example.lab2

fun suma(numbers: List<Int>): Int {
    return numbers.reduce { acc, num -> acc + num }
}

fun main () {
    // Ejercicio 1 - Promedio
    val listaNumeros = listOf<Int>(1, 9, 5, 34)
    println("Promedio: " + suma(listaNumeros).toDouble()/listaNumeros.size)

    // Ejercicio 2 - Filtrar impares
    println(listaNumeros.filter { it % 2 != 0 })

    // Ejercicio 3 - Palíndromo
    val palabra = "aaa"
    println(if (palabra == palabra.reversed()) "Es palíndromo." else "No es palíndromo.")

    // Ejercicio 4 - Saludos
    val nombres = listOf("Angel", "Esteban", "Javier", "Diego", "Elena")
    println(nombres.map {"¡Hola, $it!"})

    // Ejercicio 5 - PerformOperation
    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val sumaValores = performOperation(5, 3) { x, y -> x + y }
    println(sumaValores)

    val restaValores = performOperation(5, 3) { x, y -> x - y }
    println(restaValores)

    // Ejercicio 6 - Persona y Estudiante
    data class Person(val name: String, val age: Int, val gender: String)
    data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

    fun mapPerson (persona: Person): Student{
        return Student(persona.name, persona.age, persona.gender, "1")
    }

    val persona1 = Person("Diego", 18, "Hombre")

    val estudiante1 = mapPerson(persona1)
    println("El Estudiante ${estudiante1.name} tiene ${estudiante1.age}")
}
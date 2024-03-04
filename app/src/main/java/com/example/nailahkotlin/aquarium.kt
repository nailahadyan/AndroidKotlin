package com.example.nailahkotlin

fun main() {
    // Task 1: Assign the return value of println() to a variable called isUnit and print it.
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    // Task 2: Declare a val called temperature and initialize it to 10.
    // Declare another val called isHot and assign the return value of an if/else statement to isHot.
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    // Task 3: Use the value of an expression in a string template.
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)
}

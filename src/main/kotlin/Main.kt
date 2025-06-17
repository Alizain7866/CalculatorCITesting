package org.example
import org.example.classes.Calculator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val calc = Calculator()
    println(calc.add(1, 2))
    println(calc.subtract(1, 2))
    println(calc.multiply(1, 2))
    println(calc.divide(1, 2))
}
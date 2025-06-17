package org.example.classes

class Calculator {

    //This is the constructor for the calculator
    public fun Calculator()
    {
        println("Calculator has been created")
    }

    public fun add(a: Int, b: Int): Int
    {
        return a + b
    }

    public fun subtract(a: Int, b: Int): Int
    {
        return a - b
    }

    public fun multiply(a: Int, b: Int): Int
    {
        return a * b
    }

    public fun divide(a: Int, b: Int): Int
    {
        return (a / b)
    }
}
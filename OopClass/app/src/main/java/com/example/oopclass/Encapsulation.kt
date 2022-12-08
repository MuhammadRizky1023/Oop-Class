package com.example.oopclass



fun main() {
    val rectangle = Rectangle(5, 100)
    rectangle.rectangle
}

internal class Rectangle(var length: Int, var breadth: Int) {
    val rectangle: Unit
        get() {
            val rectangle = length * breadth / 2
            println("Area: $rectangle")
        }

}




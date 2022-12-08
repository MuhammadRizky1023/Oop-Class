package com.example.oopclass

fun main() {

    val collage =  Collage()
    collage.walk()

    val father = Father()
    father.walk()



    println(Calculate.modulo(95, 7, 9))
    println(Calculate.modulo(18, 10))
    println(Calculate.modulo(29, 20.5))
    println(Calculate.modulo(20, 10.5))
}

// overLoading
class Calculate{
    companion object{
        fun modulo(number1: Int, number2: Int): Int {
            return number1 % number2
        }

        fun modulo(number1: Int, number2: Int, number3: Int): Int {
            return number1 % number2 % number3
        }

        fun modulo(number1: Double, number2: Double): Double {
            return number1 % number2
        }

        fun modulo(number1: Int, number2: Double): Double {
            return number1 % number2
        }
    }
}

// Overriding
open class Men {

    open fun walk() {
        println("he is a walking to ...")
    }
}

class Collage : Men() {
    override fun walk() {
        super.walk()
        println("Men Walk to  collage")
    }
}



class Father : Men() {
    override fun walk() {
        super.walk()
        println("Men Walk to  his house")
    }

}


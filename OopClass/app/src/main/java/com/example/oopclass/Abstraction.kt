package com.example.oopclass

fun main() {
    val product = Product("Toyota")

    product.setCarSpeed(120)

    val speed: Int = product.getCarSpeed()
    product.getCarName()
    println("Speed= $speed")
}

abstract  class Car(name: String){
    private var name: String
    abstract  var speed: Int


   init {
       this.name = name
   }


    abstract fun setCarSpeed(_speed:Int)
    abstract fun getCarSpeed():Int

    fun getCarName(){
        println("Name: $name")
    }
}

class Product(name: String): Car(name){

    override var speed: Int = 0

    override fun setCarSpeed(_speed: Int) {
       speed = _speed
    }

    override fun getCarSpeed(): Int {
        return  speed
    }
}
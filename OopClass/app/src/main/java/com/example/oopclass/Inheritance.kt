package com.example.oopclass

fun main() {
    val website = WebDeveloper("Helmi", 19, 7500000)
    website.web()

    val  android = MobileDeveloper("Pandu", 20, 9500000)
    android.mobile()

    val ui = Designer("Yusuf", 21, 8500000)
    ui.design()

    val iot = IOT("Addin", 20, 1050000)
    iot.iot()
}

open class Employee( name: String,age: Int,salary : Int) {
  init {
      println("My Name is $name, $age year old and earning $salary ")
  }
}

class  WebDeveloper(name: String, age: Int, salary: Int): Employee(name, age, salary){
    fun web(){
        println("I am a web developer")
    }
}

class  MobileDeveloper(name: String, age: Int, salary: Int): Employee(name, age, salary){
    fun mobile(){
        println("I am a mobile developer")
    }
}

class  Designer(name: String, age: Int, salary: Int): Employee(name, age, salary){
    fun design(){
        println("I am a UI/UX designer")
    }
}

class  IOT(name: String, age: Int, salary: Int): Employee(name, age, salary){
    fun iot(){
        println("I am a IOT developer")
        println()
    }
}

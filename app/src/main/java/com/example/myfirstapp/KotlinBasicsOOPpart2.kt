package com.example.myfirstapp

fun main() {
    var myCar = Car()
    println("brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

open class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        //get() = field
        set(value) {
            field = if(value > 0) value else throw java.lang.IllegalArgumentException("MaxSpeed is less than 0")
        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M2"
        this.owner = "Frank"
    }
}
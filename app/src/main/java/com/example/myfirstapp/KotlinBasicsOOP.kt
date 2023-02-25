package com.example.myfirstapp

var b = 3
fun main() {
    var alexander = Person("Alexander", "Pak", 19)
    alexander.hobby = "to skateboard"
    alexander.age = 20
    println("Alexander is ${alexander.age} years old")
    alexander.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
    //var johnPeterson = Person(lastName = "Peterson")

    var samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")

    myFunction(5)
    b = 4
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
        "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
                println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age $age")
            }
    // Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

// Exercise
class MobilePhone(osName: String, brand: String, model: String ){
    var battery : Int = 0
    constructor(osName: String, brand: String, model: String, battery: Int)
                : this(osName, brand, model) {
                    this.battery = battery
                    println("Here the osName is $osName, brand is $brand, model is $model, battery is $battery")
                }
    init {
        println("$brand $model. " +
                "Here the osName is $osName, brand is $brand, model is $model")
    }
    fun chargeBattery() {
        println("Battery had $battery%")
        var newbattery = 30;
        var curbattery = battery + newbattery;
        println("Battery was charged by $newbattery% and now has $curbattery%")
    }
}

// Scope and Shadowing
// this a is a parameter
fun myFunction(a:Int){
    // a is a variable
    b = a
    //println("b is $b")
}
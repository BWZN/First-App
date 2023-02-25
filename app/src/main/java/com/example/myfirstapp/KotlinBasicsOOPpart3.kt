package com.example.myfirstapp

import android.annotation.SuppressLint

data class User(val id: Long, var name: String)

@SuppressLint("SuspiciousIndentation")
fun main() {
    val user1 = User(1, "Alexander")

    user1.name = "Bob"
    val user2 = User(1, "Bob")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name = "Alexander Pak")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // Alexander Pak

    val (id, name) = updatedUser
        println("id=$id, name=$name")
}
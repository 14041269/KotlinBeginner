package com.example.kotlinapp

open class Motorcycle(maxSpeed : Double, wheelCount : Int) : Drivable {

    val wheelCount : Int = wheelCount
    override val maxSpeed : Double = maxSpeed

    override fun drive(): String {
        return ""
    }

}
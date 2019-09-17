package com.example.kotlinapp

class Car (maxSpeed : Double, wheelCount : Int) : Motorcycle (maxSpeed,wheelCount) {

    override val maxSpeed: Double = maxSpeed

    override fun drive(): String {
        return "Driving a car"
    }


}
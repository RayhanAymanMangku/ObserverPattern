package com.example.observerpattern

class TemperatureDisplay : Observer {
    override fun update(temperature: Int) {
        println("The Current Temperature Display: $temperature")
    }
}
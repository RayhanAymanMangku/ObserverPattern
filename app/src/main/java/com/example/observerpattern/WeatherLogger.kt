package com.example.observerpattern

class WeatherLogger : Observer {
    override fun update(temperature: Int) {
        println("Weather Logger: $temperature °C")
    }
}
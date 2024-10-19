package com.example.observerpattern

fun main() {
    // create weather station as subject
    val weatherStation = WeatherStation() // instantiate WeatherStation

    // create observers
    val temperatureDisplay = TemperatureDisplay() // instantiate TemperatureDisplay
    val weatherLogger = WeatherLogger() // instantiate WeatherLogger
    val notificationAlert = NotificationAlert() // instantiate NotificationAlert

    // register observers to the subject where the subject is the weather station
    weatherStation.addObserver(temperatureDisplay)
    weatherStation.addObserver(weatherLogger)
    weatherStation.addObserver(notificationAlert)

    // set temperature
    weatherStation.setTemperature(20)
//    weatherStation.setTemperature(25)
//    weatherStation.setTemperature(30)
}
package com.example.observerpattern

class WeatherStation {
    private val observers = mutableListOf<Observer>()
    private var temperature:Int = 0

    fun addObserver(observer: Observer){
        observers.add(observer)
    }

    fun removeObserver(observer: Observer){
        observers.remove(observer)
    }

    fun setTemperature(temperature: Int){
        this.temperature = temperature
        notifyObservers()
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature)
        }
    }
}
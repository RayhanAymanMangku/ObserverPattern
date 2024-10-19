package com.example.observerpattern

class NotificationAlert : Observer {
    override fun update(temperature: Int) {
        when {
            temperature >= 30 -> println("Notification Alert: It's hot!")
            temperature <= 10 -> println("Notification Alert: It's cold!")
            else -> println("Notification Alert: It's normal.")
        }
    }
}
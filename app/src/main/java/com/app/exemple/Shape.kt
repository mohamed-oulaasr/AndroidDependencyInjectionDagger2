package com.app.exemple

import javax.inject.Inject

class Shape @Inject constructor(val rectangle: Rectangle, val  circle: Circle, val square: Square) {


    fun draw() {
        println("Drawing now with Dagger...")
    }
}
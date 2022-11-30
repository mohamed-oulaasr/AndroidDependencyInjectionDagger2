package com.app.exemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Dependency Injection

        val shape = DaggerShapeComponent.create().getShape()
        shape.draw()

    }


}
package com.app.exemple

import dagger.Component


@Component
interface ShapeComponent {

    fun getShape(): Shape

}
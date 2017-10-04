package com.bantolomeus.adapter.template

abstract class HouseTemplate {

    fun buildHouse(): String {
        return basePlate() + walls() + roof()
    }

    open fun roof(): String {
        return "standard roof"
    }

    private fun basePlate(): String {
        return "solid base plate, "
    }

    open fun walls(): String {
        return "standard walls, "
    }
}

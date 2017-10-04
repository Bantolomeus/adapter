package com.bantolomeus.adapter.template

class MetalHouse : HouseTemplate() {

    override fun roof(): String {
        return "concrete flat roof"
    }

    override fun walls(): String {
        return "massive metal and glass walls, "
    }

}
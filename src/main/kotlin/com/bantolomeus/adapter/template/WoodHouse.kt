package com.bantolomeus.adapter.template

class WoodHouse: HouseTemplate() {

    override fun roof(): String {
        return "wood shingles"
    }

    override fun walls(): String {
        return "massive wood walls, "
    }

}
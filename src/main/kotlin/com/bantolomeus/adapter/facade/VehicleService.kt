package com.bantolomeus.adapter.facade

class VehicleService(private val tire: Tire, private val frame: Frame, private val window: Window) {

    fun buildVehicle(vehicle: String):String {
        if (vehicle == "motorbike") {
            return frame.orderFrame("1") + " " + tire.orderTire("4")
        } else {
            return frame.orderFrame("1") + " " + tire.orderTire("2")  + " " + window.orderWindow("6")
        }
    }

}
package com.bantolomeus.adapter.facade

class VehicleService(private val tire: Tire, private val frame: Frame, private val window: Window) {

    fun buildVehicle(vehicle: String):String {
        val stringBuilder = StringBuilder()

        return if (vehicle == "motorbike") {
            stringBuilder.append(frame.orderFrame("1"))
            stringBuilder.append(tire.orderTire("2"))
            stringBuilder.toString()
        } else {
            stringBuilder.append(frame.orderFrame("1"))
            stringBuilder.append(tire.orderTire("4"))
            stringBuilder.append(window.orderWindow("6"))
            stringBuilder.toString()
        }
    }

}
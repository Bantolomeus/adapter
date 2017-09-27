package com.bantolomeus.adapter.russianMapApi

import org.springframework.stereotype.Service

@Service
class RussianMapService {

    fun translateGeoData(coordinates: Coordinates): String {
        return coordinates.returnCoordinates()
    }
}
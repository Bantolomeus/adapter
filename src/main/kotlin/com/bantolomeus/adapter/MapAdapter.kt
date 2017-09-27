package com.bantolomeus.adapter

import com.bantolomeus.adapter.russianMapApi.Coordinates
import com.bantolomeus.adapter.russianMapApi.RussianMapService
import org.springframework.stereotype.Service

@Service
class MapAdapter(private val russianMapService: RussianMapService) {

    fun translateGeoData(geoData: GeoData): String {
        return russianMapService.translateGeoData(Coordinates(geoData.latitude + ";" + geoData.longitude))
    }
}
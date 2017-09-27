package com.bantolomeus.adapter

import org.springframework.stereotype.Service

@Service
class Geologist(private val mapAdapter: MapAdapter) {

    fun createMap(longitude: String, latitude: String): String {
        return mapAdapter.translateGeoData(createGeoData(longitude, latitude))
    }

    private fun createGeoData(longitude: String, latitude: String): GeoData {
        return GeoData(longitude,latitude)
    }

}

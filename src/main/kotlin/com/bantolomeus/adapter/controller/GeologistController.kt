package com.bantolomeus.adapter.controller

import com.bantolomeus.adapter.Geologist
import com.bantolomeus.adapter.MapAdapter
import com.bantolomeus.adapter.russianMapApi.RussianMapService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class GeologistController() {

    @RequestMapping(path = arrayOf("/geologist"), method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))

    fun getCalculatorData(
            @RequestParam(value = "longitude", required = true) longitude: String,
            @RequestParam(value = "latitude", required = true) latitude: String
    ): ResponseEntity<String> {

        val geo = Geologist(MapAdapter(RussianMapService()))
        val bla = geo.createMap(longitude,latitude)
        return ResponseEntity(bla, HttpStatus.OK)
    }
}

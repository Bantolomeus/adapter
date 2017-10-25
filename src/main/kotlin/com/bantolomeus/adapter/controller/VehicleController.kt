package com.bantolomeus.adapter.controller

import com.bantolomeus.adapter.facade.Frame
import com.bantolomeus.adapter.facade.Tire
import com.bantolomeus.adapter.facade.VehicleService
import com.bantolomeus.adapter.facade.Window
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class VehicleController {

    @RequestMapping(path = arrayOf("/buildVehicle"), method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))

    fun getCalculatorData(
            @RequestParam(value = "vehicle", required = true) vehicle: String
    ): ResponseEntity<String> {

        return ResponseEntity(VehicleService(Tire(), Frame(), Window()).buildVehicle(vehicle), HttpStatus.OK)
    }
}

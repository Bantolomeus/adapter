package com.bantolomeus.adapter.controller

import com.bantolomeus.adapter.template.MetalHouse
import com.bantolomeus.adapter.template.WoodHouse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity


@RestController
class TemplateController {

    @RequestMapping(path = arrayOf("/woodhouse"), method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))

    fun buildWoodHouse(
    ): ResponseEntity<String> {

        val woodHouse = WoodHouse()

        return ResponseEntity(woodHouse.buildHouse(), HttpStatus.OK)
    }

    @RequestMapping(path = arrayOf("/metalhouse"), method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))

    fun buildMetalHouse(
    ): ResponseEntity<String> {

        val metalHouse = MetalHouse()

        return ResponseEntity(metalHouse.buildHouse(), HttpStatus.OK)
    }
}
package com.bantolomeus.adapter.iteratorAndComposit.composit

class TiniestPicture(private val text: String) : Picture {

    override fun print() {
        println("tiniest picture $text")
    }
}
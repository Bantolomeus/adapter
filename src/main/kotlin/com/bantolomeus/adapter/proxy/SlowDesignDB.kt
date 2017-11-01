package com.bantolomeus.adapter.proxy

class SlowDesignDB : DesignDBInterface {
    var designs = mutableListOf<String>("design 3", "design 425", "special design", "invisible design")

    override fun getAllDesigns(): MutableList<String> {
        return designs
    }

}
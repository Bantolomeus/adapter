package com.bantolomeus.adapter.proxy

class Client {
    private val designDB = DesignDBProxyCache()

    fun getAllDesigns(): MutableList<String> {
        return designDB.getAllDesigns()
    }
}
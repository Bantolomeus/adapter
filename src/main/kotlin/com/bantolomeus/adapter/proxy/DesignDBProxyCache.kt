package com.bantolomeus.adapter.proxy

class DesignDBProxyCache : DesignDBInterface {
    val slowDesignDB = SlowDesignDB()
    var designs = mutableListOf<String>()

    override fun getAllDesigns(): MutableList<String> {
        return designs
    }

    // scheduled task that triggers all 30 minutes
    fun updateDesignCache() {
        designs = slowDesignDB.getAllDesigns()
    }
}
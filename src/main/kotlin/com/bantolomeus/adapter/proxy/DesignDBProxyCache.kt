package com.bantolomeus.adapter.proxy

class DesignDBProxyCache : DesignDBInterface {
    private val slowDesignDB = SlowDesignDB()
    private var designs = mutableListOf<String>()

    init {
        updateDesignCache()
    }

    override fun getAllDesigns(): MutableList<String> {
        return designs
    }

    // scheduled task that triggers all 30 minutes
    private fun updateDesignCache() {
        designs = slowDesignDB.getAllDesigns()
    }
}
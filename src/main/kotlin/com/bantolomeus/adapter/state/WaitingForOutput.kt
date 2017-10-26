package com.bantolomeus.adapter.state

class WaitingForOutput(private val context: Context): StateInterface {
    override fun handleAction() {
        handOutItem()
    }

    override fun inputIncoming() {
        println("currently not possible")
    }

    override fun insertMoney() {
        println("currently not possible")
    }

    override fun handOutItem() {
        println("here is your beverage")
    }

}
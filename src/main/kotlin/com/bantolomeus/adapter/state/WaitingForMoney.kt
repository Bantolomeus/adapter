package com.bantolomeus.adapter.state

class WaitingForMoney(private val context: Context): StateInterface {
    override fun handleAction() {
        insertMoney()
    }

    override fun inputIncoming() {
        println("currently not possible")
    }

    override fun insertMoney() {
        println("please wait for beverage")
        context.state = WaitingForOutput(context)
    }

    override fun handOutItem() {
        println("currently not possible")
    }

}

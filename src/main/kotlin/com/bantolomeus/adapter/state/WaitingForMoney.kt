package com.bantolomeus.adapter.state

class WaitingForMoney(private val context: Context): StateInterface {
    override fun handleAction() {
        inputIncoming()
    }

    override fun inputIncoming() {
        println("currently not possible")
    }

    override fun insertMoney() {
        println("please insert 1 Euro")
        context.state = WaitingForOutput(context)
    }

    override fun handOutItem() {
        println("currently not possible")
    }

}

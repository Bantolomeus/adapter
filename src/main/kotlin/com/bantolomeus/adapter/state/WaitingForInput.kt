package com.bantolomeus.adapter.state

class WaitingForInput(private val context: Context): StateInterface {


    override fun handleAction() {
        inputIncoming()
    }

    override fun inputIncoming() {
        println("please insert 1 Euro")
        context.state = WaitingForMoney(context)
    }

    override fun insertMoney() {
        println("currently not possible")
    }

    override fun handOutItem() {
        println("currently not possible")
    }


}
package com.bantolomeus.adapter.state

class Context {
    var state : StateInterface = WaitingForInput(this)

    fun handleAction() {
        state.handleAction()
//        state = WaitingForInput(context = Context())
    }

}

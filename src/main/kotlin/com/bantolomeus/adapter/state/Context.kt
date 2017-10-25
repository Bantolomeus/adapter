package com.bantolomeus.adapter.state

class Context {
    var state : StateInterface = WaitingForInput(Context())

    fun handleAction() {
        state.handleAction()
//        state = WaitingForInput(context = Context())
    }

}

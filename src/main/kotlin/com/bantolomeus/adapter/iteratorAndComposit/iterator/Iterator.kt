package com.bantolomeus.adapter.iteratorAndComposit.iterator

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}
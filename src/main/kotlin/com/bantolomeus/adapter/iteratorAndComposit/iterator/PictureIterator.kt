package com.bantolomeus.adapter.iteratorAndComposit.iterator

import com.bantolomeus.adapter.iteratorAndComposit.Picture
import com.bantolomeus.adapter.iteratorAndComposit.TiniestPicture

class PictureIterator(list: MutableList<Picture>) {
    private val tiniestPictures = mutableListOf<Picture>()
    private var position = 0

    init {
        tiniestPictures.addAll(list)
    }

    fun next(): Picture {
        return tiniestPictures[position].also { position++ }
    }

    fun hasNext(): Boolean {
        return position <= tiniestPictures.size
    }
}
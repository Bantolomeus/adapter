package com.bantolomeus.adapter.iteratorAndComposit.iterator

import com.bantolomeus.adapter.iteratorAndComposit.iterator.Picture

class Picture {
    private val pictures = mutableListOf<TinyPicture>()

    fun add(picture: TinyPicture) {
        pictures.add(picture)
    }

    fun createIterator(): Iterator {
        return PictureIterator(pictures)
    }
}
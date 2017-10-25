package com.bantolomeus.adapter.iteratorAndComposit.iterator

class Picture {
    private val pictures = mutableListOf<TinyPicture>()

    fun add(picture: TinyPicture) {
        pictures.add(picture)
    }

    fun createIterator(): Iterator {
        return TinyPictureIterator(pictures)
    }
}
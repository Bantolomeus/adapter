package com.bantolomeus.adapter.iteratorAndComposit

class CompositePicture : Picture {

    private val pictureParts = mutableListOf<Picture>()

    override fun print() {
        for (picture in pictureParts) {
            picture.print()
        }
    }

    fun add(picture: Picture) {
        pictureParts.add(picture)
    }

    fun remove(picture: Picture) {
        pictureParts.remove(picture)
    }
}
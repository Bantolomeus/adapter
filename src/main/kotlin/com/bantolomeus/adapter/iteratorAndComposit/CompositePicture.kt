package com.bantolomeus.adapter.iteratorAndComposit

import com.bantolomeus.adapter.iteratorAndComposit.iterator.PictureIterator

class CompositePicture : Picture {

    private val pictureParts = mutableListOf<Picture>()
    private val tiniestPictures = mutableListOf<Picture>()

    fun createPictureIterator(): PictureIterator {
        return PictureIterator(tiniestPictures)
    }


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
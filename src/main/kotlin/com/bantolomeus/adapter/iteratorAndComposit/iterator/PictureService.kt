package com.bantolomeus.adapter.iteratorAndComposit.iterator

class PictureService(private val picture: Picture) {

    fun printPicture() {
        val pictureIterator = picture.createIterator()
        printPictureHelp(pictureIterator)
    }

    private fun printPictureHelp(iterator: Iterator) {
        while (iterator.hasNext()) {
            val currentPicture : TinyPicture = iterator.next() as TinyPicture
            currentPicture.print()
        }
    }

}
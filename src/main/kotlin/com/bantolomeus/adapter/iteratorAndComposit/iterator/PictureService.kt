package com.bantolomeus.adapter.iteratorAndComposit.iterator

class PictureService(private val picture: Picture) {

    fun printPicture() {
        val pictureIterator = picture.createIterator()

    }

    private fun printPictureHelp(iterator: Iterator) {
        while (iterator.hasNext()) {
            val currentPicture = iterator.next()
//            println(currentPicture.)
        }
    }

}
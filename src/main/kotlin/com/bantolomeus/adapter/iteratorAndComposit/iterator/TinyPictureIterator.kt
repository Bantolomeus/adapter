package com.bantolomeus.adapter.iteratorAndComposit.iterator

class TinyPictureIterator(private val list: MutableList<TinyPicture>): Iterator {
//    class TinyPictureIterator(list: MutableList<TinyPicture>): Iterator {
//    private val pictures = mutableListOf<TinyPicture>()
    private var position = 0

//    init {
//        pictures.addAll(list)
//    }

    override fun next(): TinyPicture {
//        return pictures[position].also { position++ }
        return list[position].also { position++ }
    }

    override fun hasNext(): Boolean {
//        return position < pictures.size
        return position < list.size
    }
}
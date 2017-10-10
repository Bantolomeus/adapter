package com.bantolomeus.adapter.iteratorAndComposit.iterator

import com.bantolomeus.adapter.iteratorAndComposit.iterator.Picture

class PictureIterator(list: MutableList<TinyPicture>): Iterator {
    private val pictures = mutableListOf<TinyPicture>()
    private var position = 0

    init {
        pictures.addAll(list)
    }

    override fun next(): TinyPicture {
        return pictures[position].also { position++ }
    }

    override fun hasNext(): Boolean {
        return position < pictures.size
    }
}
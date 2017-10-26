package com.bantolomeus.adapter

import com.bantolomeus.adapter.iteratorAndComposit.composit.CompositePicture
import com.bantolomeus.adapter.iteratorAndComposit.composit.TiniestPicture
import com.bantolomeus.adapter.iteratorAndComposit.iterator.Picture
import com.bantolomeus.adapter.iteratorAndComposit.iterator.PictureService
import com.bantolomeus.adapter.iteratorAndComposit.iterator.TinyPicture
import com.bantolomeus.adapter.state.Context
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AdapterApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdapterApplication::class.java, *args)

    val tinyPicture1 = TinyPicture("tiny picture 1")
    val tinyPicture2 = TinyPicture("tiny picture 2")
    val tinyPicture4 = TinyPicture("tiny picture 4")
    val tinyPicture3 = TinyPicture("tiny picture 3")
    val tinyPicture5 = TinyPicture("tiny picture 5")
    val tinyPicture6 = TinyPicture("tiny picture 6")
    val tinyPicture7 = TinyPicture("tiny picture 7")
    val tinyPicture8 = TinyPicture("tiny picture 8")

    val pictureFromIterator = Picture()
    pictureFromIterator.add(tinyPicture1)
    pictureFromIterator.add(tinyPicture2)
    pictureFromIterator.add(tinyPicture3)
    pictureFromIterator.add(tinyPicture4)
    pictureFromIterator.add(tinyPicture5)
    pictureFromIterator.add(tinyPicture6)
    pictureFromIterator.add(tinyPicture7)
    pictureFromIterator.add(tinyPicture8)

    val pictureService = PictureService(pictureFromIterator)
    pictureService.printPicture()

    println()

    val tiniestPicture1 = TiniestPicture("1")
    val tiniestPicture2 = TiniestPicture("2")
    val tiniestPicture3 = TiniestPicture("3")
    val tiniestPicture4 = TiniestPicture("4")
    val tiniestPicture5 = TiniestPicture("5")

    val picture = CompositePicture()
    val pictureA = CompositePicture()
    val pictureB = CompositePicture()

    pictureA.add(tiniestPicture1)
    pictureA.add(tiniestPicture5)
    pictureA.add(tiniestPicture3)

    pictureB.add(tiniestPicture2)
    pictureB.add(tiniestPicture4)

    picture.add(pictureB)
    picture.add(pictureA)

    picture.print()


    val context = Context()
    context.handleAction()
    context.handleAction()
    context.handleAction()
}

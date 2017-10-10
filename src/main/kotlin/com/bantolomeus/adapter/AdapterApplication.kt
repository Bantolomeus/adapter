package com.bantolomeus.adapter

import com.bantolomeus.adapter.iteratorAndComposit.composit.CompositePicture
import com.bantolomeus.adapter.iteratorAndComposit.composit.TiniestPicture
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AdapterApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdapterApplication::class.java, *args)

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
}

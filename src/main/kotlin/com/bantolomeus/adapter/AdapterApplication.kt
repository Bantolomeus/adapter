package com.bantolomeus.adapter

import com.bantolomeus.adapter.iteratorAndComposit.CompositePicture
import com.bantolomeus.adapter.iteratorAndComposit.TiniestPicture
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AdapterApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdapterApplication::class.java, *args)

    val tiniestPicture1 = TiniestPicture()
    val tiniestPicture2 = TiniestPicture()
    val tiniestPicture3 = TiniestPicture()
    val tiniestPicture4 = TiniestPicture()
    val tiniestPicture5 = TiniestPicture()

    val picture = CompositePicture()
    val pictureA = CompositePicture()
    val pictureB = CompositePicture()

    pictureA.add(tiniestPicture1)
    pictureA.add(tiniestPicture5)
    pictureA.add(tiniestPicture3)

    pictureB.add(tiniestPicture2)
    pictureB.add(tiniestPicture4)

    picture.add(pictureA)
    picture.add(pictureB)

    picture.print()
}

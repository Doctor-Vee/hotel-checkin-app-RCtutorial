package com.tutorials.rc

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val hotelRepository: HotelRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        this.hotelRepository.deleteAll()

        val federalPalace = Hotel("Federal Palace Hotel", 3, 30)
        val southernSun = Hotel("Southern Sun", 5, 90)
        val ekoHotel = Hotel(nbRooms = 40, classification = 4, name = "Eko Hotel")

        var hotels = mutableListOf<Hotel>()
        hotels.add(federalPalace)
        hotels.add(southernSun)
        hotels.add(ekoHotel)

        for (hotel in hotels){
        this.hotelRepository.save(hotel)
        }
        println("-- Database has been initialized")
    }

}
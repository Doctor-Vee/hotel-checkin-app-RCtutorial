package com.tutorials.rc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RcApplication

fun main(args: Array<String>) {
    runApplication<RcApplication>(*args)
}

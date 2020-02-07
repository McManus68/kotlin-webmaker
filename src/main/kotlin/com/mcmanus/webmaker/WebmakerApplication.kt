package com.mcmanus.webmaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebmakerApplication

fun main(args: Array<String>) {
	runApplication<WebmakerApplication>(*args)
}

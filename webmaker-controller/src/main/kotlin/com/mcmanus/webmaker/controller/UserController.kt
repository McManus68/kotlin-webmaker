package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import kotlin.streams.toList

@RestController
class UserController {

    @Autowired
    lateinit var service : UserService

    @GetMapping("/leaders")
    fun getLeaders(): List<String> = service.leaders().stream().map { it.mail }.toList()

    @PostMapping("/user/{handle}/score")
    fun postPlayerScore(@PathVariable handle: String, @RequestBody points: String) : String {
        return "$handle now has a total score of $points."
    }

}
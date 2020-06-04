package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.AnimationType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/config")
class ConfigController {

    @GetMapping("/animations")
    fun getAll(): Array<AnimationType> = AnimationType.values()
}

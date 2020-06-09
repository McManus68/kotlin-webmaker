package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.Config
import com.mcmanus.webmaker.service.ConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/config")
class ConfigController {

    @Autowired
    lateinit var service: ConfigService

    @GetMapping()
    fun getConfig(): Config = service.getAll()
}

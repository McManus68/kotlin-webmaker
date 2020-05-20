package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.ConfigType
import com.mcmanus.webmaker.model.Param
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
    fun getConfig(): Map<ConfigType, Map<String, List<Param>?>?> {
        return service.getConfig()
    }

    @GetMapping("/sites")
    fun getSitesConfig(): Map<String, List<Param>?>? {
        return service.getSitesConfig()
    }

    @GetMapping("/pages")
    fun getPagesConfig(): Map<String, List<Param>?>? {
        return service.getPagesConfig()
    }

    @GetMapping("/sections")
    fun getSectionsConfig(): Map<String, List<Param>?>? {
        return service.getSectionsConfig()
    }

    @GetMapping("/blocks")
    fun getBlocksConfig(): Map<String, List<Param>?>? {
        return service.getBlocksConfig()
    }

}
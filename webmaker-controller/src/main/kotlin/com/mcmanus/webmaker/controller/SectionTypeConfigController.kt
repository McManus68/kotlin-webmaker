package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.SectionTypeConfig
import com.mcmanus.webmaker.service.SectionTypeConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/config/sections")
class SectionTypeConfigController {

    @Autowired
    lateinit var service: SectionTypeConfigService

    @GetMapping
    fun getAll(): List<SectionTypeConfig> = service.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id : String): SectionTypeConfig = service.get(id)

    @PostMapping
    fun create(@RequestBody sectionTypeConfig: SectionTypeConfig): SectionTypeConfig = service.create(sectionTypeConfig)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : String) = service.delete(id)
}
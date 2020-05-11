package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.service.SiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/sites")
class SiteController {

    @Autowired
    lateinit var service: SiteService

    @GetMapping
    fun getAll(): List<Site> = service.getAll()

    @PostMapping
    fun create(@RequestBody site: Site): Site = service.create(site);

    @DeleteMapping("purge")
    fun deleteAll() = service.deleteAll()
}
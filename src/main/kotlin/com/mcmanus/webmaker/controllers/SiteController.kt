package com.mcmanus.webmaker.controllers

import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.services.SiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/sites")
class SiteController {

    @Autowired
    lateinit var service : SiteService

    @GetMapping
    fun getAll(): List<Site> = service.getAll(1L)

    @PostMapping
    fun create(@RequestBody site: Site) : Site = service.create(site);
}
package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.service.SiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/sites")
class SiteController {

    @Autowired
    lateinit var service: SiteService

    @GetMapping
    fun getAll(): List<Site> = service.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id : String): Site = service.get(id)

    @PostMapping
    fun create(@RequestBody site: Site): Site = service.create(site)

    @PutMapping
    fun update(@RequestBody site: Site): Site = service.update(site)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : String) = service.delete(id)
}
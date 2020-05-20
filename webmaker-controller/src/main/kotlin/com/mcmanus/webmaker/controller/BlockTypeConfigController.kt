package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.BlockTypeConfig
import com.mcmanus.webmaker.service.BlockTypeConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/config/blocks")
class BlockTypeConfigController {

    @Autowired
    lateinit var service: BlockTypeConfigService

    @GetMapping
    fun getAll(): List<BlockTypeConfig> = service.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id : String): BlockTypeConfig = service.get(id)

    @PostMapping
    fun create(@RequestBody blockTypeConfig: BlockTypeConfig): BlockTypeConfig = service.create(blockTypeConfig)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : String) = service.delete(id)
}
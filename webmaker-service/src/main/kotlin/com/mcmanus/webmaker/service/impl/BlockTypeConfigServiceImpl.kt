package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.BlockTypeConfig
import com.mcmanus.webmaker.persistence.repository.BlockTypeConfigRepository
import com.mcmanus.webmaker.service.BlockTypeConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BlockTypeConfigServiceImpl : BlockTypeConfigService {

    @Autowired
    lateinit var repository: BlockTypeConfigRepository

    override fun getAll(): List<BlockTypeConfig> = repository.findAll()
    override fun get(id: String): BlockTypeConfig = repository.findById(id).get()
    override fun create(blockTypeConfig: BlockTypeConfig): BlockTypeConfig = repository.save(blockTypeConfig)
    override fun delete(id: String) = repository.deleteById(id)

}
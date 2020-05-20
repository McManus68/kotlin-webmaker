package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.SectionTypeConfig
import com.mcmanus.webmaker.persistence.repository.SectionTypeConfigRepository
import com.mcmanus.webmaker.service.SectionTypeConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SectionTypeConfigServiceImpl : SectionTypeConfigService {

    @Autowired
    lateinit var repository: SectionTypeConfigRepository

    override fun getAll(): List<SectionTypeConfig> = repository.findAll()
    override fun get(id: String): SectionTypeConfig = repository.findById(id).get()
    override fun create(sectionTypeConfig: SectionTypeConfig): SectionTypeConfig = repository.save(sectionTypeConfig)
    override fun delete(id: String) = repository.deleteById(id)

}
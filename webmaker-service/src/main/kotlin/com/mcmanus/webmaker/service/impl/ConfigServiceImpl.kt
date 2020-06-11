package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.Config
import com.mcmanus.webmaker.service.BlockTypeConfigService
import com.mcmanus.webmaker.service.ConfigService
import com.mcmanus.webmaker.service.SectionTypeConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ConfigServiceImpl : ConfigService {

    @Autowired
    lateinit var blockConfigService: BlockTypeConfigService

    @Autowired
    lateinit var sectionConfigService: SectionTypeConfigService

    override fun getAll(): Config {
        return Config(blockConfigService.getAll(), sectionConfigService.getAll())
    }
}
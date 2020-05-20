package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.BlockType
import com.mcmanus.webmaker.model.ConfigType
import com.mcmanus.webmaker.model.PageType
import com.mcmanus.webmaker.model.Param
import com.mcmanus.webmaker.model.SectionType
import com.mcmanus.webmaker.model.SiteType
import com.mcmanus.webmaker.service.ConfigService
import org.springframework.stereotype.Service

@Service
class ConfigServiceImpl : ConfigService {

    override fun getConfig(): Map<ConfigType, Map<String, List<Param>?>?> {
        return mapOf(
                ConfigType.SITE to getSectionsConfig(),
                ConfigType.PAGE to getPagesConfig(),
                ConfigType.SECTION to getSectionsConfig(),
                ConfigType.BLOCK to getBlocksConfig())
    }

    override fun getSitesConfig(): Map<String, List<Param>?>? {
        return SiteType.values().map { it.name to it.params }.toMap()
    }

    override fun getPagesConfig(): Map<String, List<Param>?>? {
        return PageType.values().map { it.name to it.params }.toMap()
    }

    override fun getSectionsConfig(): Map<String, List<Param>?>? {
        return SectionType.values().map { it.name to it.params }.toMap()
    }

    override fun getBlocksConfig(): Map<String, List<Param>?>? {
        return BlockType.values().map { it.name to it.params }.toMap()
    }
}
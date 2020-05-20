package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.SectionTypeConfig

interface SectionTypeConfigService {

    fun getAll() : List<SectionTypeConfig>
    fun get(id: String) : SectionTypeConfig
    fun create(sectionTypeConfig : SectionTypeConfig): SectionTypeConfig
    fun delete(id: String): Unit
}
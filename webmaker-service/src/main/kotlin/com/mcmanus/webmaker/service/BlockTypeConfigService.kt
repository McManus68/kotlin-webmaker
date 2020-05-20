package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.BlockTypeConfig

interface BlockTypeConfigService {

    fun getAll() : List<BlockTypeConfig>
    fun get(id: String) : BlockTypeConfig
    fun create(blockTypeConfig : BlockTypeConfig): BlockTypeConfig
    fun delete(id: String): Unit
}
package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "block_type_config")
data class BlockTypeConfig(
        @Id
        var id: String,
        var type: BlockType = BlockType.BLOCK_SIMPLE_CONTENT,
        val params: List<Param> = emptyList()
 )


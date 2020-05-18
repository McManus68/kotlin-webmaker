package com.mcmanus.webmaker.model

data class Row(
        var type: String = "ROW",
        var blocks: List<Block> = emptyList()
)


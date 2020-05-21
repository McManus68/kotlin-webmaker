package com.mcmanus.webmaker.model

data class Block(
        var type: BlockType,
        var classes: String = "",
        var params: Map<String, Any>?,
        var responsive: Responsive?,
        var animation: Animation?
)


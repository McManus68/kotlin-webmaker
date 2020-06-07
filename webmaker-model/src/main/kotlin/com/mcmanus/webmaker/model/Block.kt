package com.mcmanus.webmaker.model

data class Block(
        var type: BlockType,
        var classes: String = "",
        var params: List<Param> = emptyList(),
        var responsive: Responsive?,
        var animation: Animation?
)


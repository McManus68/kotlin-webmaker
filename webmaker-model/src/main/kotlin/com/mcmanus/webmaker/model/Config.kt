package com.mcmanus.webmaker.model

data class Config(
        var block: List<BlockTypeConfig>,
        var section: List<SectionTypeConfig>,
        var animation: List<AnimationType> = AnimationType.values().asList(),
        var header: List<HeaderType> = HeaderType.values().asList(),
        var default: Map<String, Any> = mapOf(  "theme" to Theme(),
                                                "footer" to Footer(),
                                                "header" to Header(),
                                                "block" to Block(),
                                                "row" to Row(),
                                                "section" to Section())
)


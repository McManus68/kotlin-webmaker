package com.mcmanus.webmaker.model

data class Config(
        var block: List<BlockTypeConfig>,
        var section: List<SectionTypeConfig>,
        var animation: List<AnimationType> = AnimationType.values().asList(),
        var nav: List<NavType> = NavType.values().asList(),
        var default: Map<String, Any> = mapOf("theme" to Theme(), "footer" to Footer(), "header" to Header())
)


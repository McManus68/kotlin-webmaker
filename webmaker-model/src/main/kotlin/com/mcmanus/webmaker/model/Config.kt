package com.mcmanus.webmaker.model

data class Config(
        var animation: List<AnimationType>,
        var nav: List<NavType>,
        var block: List<BlockTypeConfig>,
        var section: List<SectionTypeConfig>
)


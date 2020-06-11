package com.mcmanus.webmaker.model

data class Animation(
        var type: AnimationType = AnimationType.NONE,
        var delay: Int = 0,
        var left: Boolean = false,
        var right: Boolean = false,
        var top: Boolean = false,
        var bottom: Boolean = false
)




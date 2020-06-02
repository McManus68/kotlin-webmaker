package com.mcmanus.webmaker.model

data class ParamConfig(
        var name: String,
        var type: ParamType,
        var isArray: Boolean,
        var choiceValues: List<String> = emptyList(),
        var defaultValue: Any
)


package com.mcmanus.webmaker.model

data class ParamConfig(
        var name: String,
        var type: ParamType,
        var isArray: Boolean,
        var defaultValue: Any
)


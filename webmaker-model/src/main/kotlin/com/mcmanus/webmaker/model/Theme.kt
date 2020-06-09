package com.mcmanus.webmaker.model

data class Theme(
        var color:Map<String, String> = emptyMap(),
        var footer:Map<String, String> = emptyMap(),
        var header:Map<String, String> = emptyMap(),
        var block:Map<String, String> = emptyMap(),
        var section:Map<String, String> = emptyMap(),
        var font:Map<String, String> = emptyMap(),
        var breakpoint:Map<String, String> = emptyMap()

)


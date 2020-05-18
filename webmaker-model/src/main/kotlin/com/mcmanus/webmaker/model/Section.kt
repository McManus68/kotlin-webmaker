package com.mcmanus.webmaker.model

open class Section(
        var type: SectionType,
        var params: Map<String, Any> = emptyMap(),
        var rows: List<Row> = emptyList()
)


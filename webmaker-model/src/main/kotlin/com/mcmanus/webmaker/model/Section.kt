package com.mcmanus.webmaker.model

open class Section(
        var type: SectionType,
        var params: Map<String, Any>?,
        var rows: List<Row> = emptyList()
)


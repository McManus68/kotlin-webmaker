package com.mcmanus.webmaker.model

open class Section(
        var type: SectionType,
        var params: List<Param> = emptyList(),
        var rows: List<Row> = emptyList()
)


package com.mcmanus.webmaker.model

open class Section(
        var type: SectionType = SectionType.SECTION_CUSTOM,
        var params: List<Param> = emptyList(),
        var rows: List<Row> = emptyList()
)


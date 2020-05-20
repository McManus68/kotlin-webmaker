package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "section_type_config")
data class SectionTypeConfig(
        @Id
        var id: String,
        var type: SectionType = SectionType.SECTION_CUSTOM,
        var standalone: Boolean = false,
        val params: List<Param> = emptyList()
 )


package com.mcmanus.webmaker.model

open class Footer(
        var type: FooterType = FooterType.FOOTER,
        var rows: List<Row> = emptyList()
)


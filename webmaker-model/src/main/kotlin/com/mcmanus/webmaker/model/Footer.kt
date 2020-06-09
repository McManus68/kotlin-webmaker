package com.mcmanus.webmaker.model

data class Footer(
        var type: String = "FOOTER",
        var rows: List<Row> = emptyList()
)


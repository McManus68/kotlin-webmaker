package com.mcmanus.webmaker.model

data class Section(
        var type: String,
        var params: Map<String, String>?,
        var rows: List<Row>?
)


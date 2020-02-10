package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "sequences")
data class Sequence(
    @Id
    var id: String,
    var seq: Long
)
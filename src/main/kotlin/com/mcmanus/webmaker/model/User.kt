package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User (
    @Id
    val id: Long,
    val mail: String,
    val phone: String
)

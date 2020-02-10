package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "site")
data class Site (
    @Id
    val id: Long,
    val name: String,
    val title: String,
    val userId: Long
)

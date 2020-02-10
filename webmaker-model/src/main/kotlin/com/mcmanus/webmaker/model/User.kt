package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User (
    @Id
    var id: Long,
    var name: String,
    var mail: String,
    var phone: String
)

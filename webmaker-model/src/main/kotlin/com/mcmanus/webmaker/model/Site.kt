package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "site")
data class Site (
        @Id
    var id: String,
        var name: String,
        var title: String,
        var description: String,
        @DBRef
    var pages: List<Page>
)


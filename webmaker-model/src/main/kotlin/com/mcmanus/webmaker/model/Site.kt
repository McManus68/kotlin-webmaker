package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "site")
data class Site(
        @Id
        var id: String?,
        var name: String,
        var title: String,
        var description: String = "",
        var logo: String = "",
        var pages: List<Page> = emptyList(),
        var footer: Footer = Footer(),
        var header: Header = Header(),
        var theme: Theme = Theme()
)

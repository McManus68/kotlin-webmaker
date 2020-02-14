package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id

data class Page (
    @Id
    var id: Long,
    var position: Short,
    var name: String,
    var title: String,
    var siteId: Long
)


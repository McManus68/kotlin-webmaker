package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id

data class Page (

    var title: String,
    var slug: String,
    var description: String
)


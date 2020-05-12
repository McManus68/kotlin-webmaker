package com.mcmanus.webmaker.model

data class Page(
        var title: String,
        var slug: String,
        var description: String,
        var sections: List<Section>
)


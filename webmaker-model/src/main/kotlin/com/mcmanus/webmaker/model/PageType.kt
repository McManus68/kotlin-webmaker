package com.mcmanus.webmaker.model

enum class PageType(val params: List<Param>?) {

    PAGE(listOf(Param("name", ParamType.STRING, false, ""),
                Param("slug", ParamType.STRING, false, ""),
                Param("description", ParamType.STRING, false, ""))),
}



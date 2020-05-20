package com.mcmanus.webmaker.model

enum class SiteType(val params: List<Param>?) {

    SITE(listOf(Param("name", ParamType.STRING, false, ""),
                Param("title", ParamType.STRING, false, ""),
                Param("description", ParamType.STRING, false, ""))),
}



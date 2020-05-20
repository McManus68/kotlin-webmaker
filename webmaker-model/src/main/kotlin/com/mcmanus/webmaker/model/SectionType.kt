package com.mcmanus.webmaker.model

enum class SectionType(val params: List<Param>?) {

    SECTION_HERO(listOf(Param("title", ParamType.STRING, false, ""),
                Param("subtitle", ParamType.STRING, false, ""),
                Param("image", ParamType.IMAGE, false, ""),
                Param("overlay", ParamType.STRING, false, ""))),

    SECTION_HEADLINE(listOf(Param("title", ParamType.STRING, false, ""),
                Param("subtitle", ParamType.STRING, false, ""),
                Param("image", ParamType.IMAGE, false, ""),
                Param("overlay", ParamType.STRING, false, ""))),

    SECTION_CUSTOM(null)
}



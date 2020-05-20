package com.mcmanus.webmaker.model

enum class BlockType(val params: List<Param>?) {

    BLOCK_SIMPLE_CONTENT(listOf(Param("title", ParamType.STRING, false, ""),
            Param("subtitle", ParamType.STRING, false, ""),
            Param("buttonText", ParamType.STRING, false, ""))),

    BLOCK_GALLERY(listOf(Param("images", ParamType.IMAGE, true, "")))
}



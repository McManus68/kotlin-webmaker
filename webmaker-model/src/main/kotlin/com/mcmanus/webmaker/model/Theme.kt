package com.mcmanus.webmaker.model

data class Theme(
        var color:Map<String, String> = mapOf("primary" to "#2f7208", "secondary" to "#b72222", "font" to "#515151", "bg" to  "#fff"),
        var footer:Map<String, String> = mapOf("bg" to "#121212", "color" to "#fff"),
        var header:Map<String, String> = mapOf("bg" to "#121212", "color" to "#fff"),
        var block:Map<String, String> = mapOf("padding" to "2.4rem", "spacing" to "1.2rem"),
        var section:Map<String, String> = mapOf("padding" to "2.2rem 1.8rem"),
        var font:Map<String, String> = mapOf("primary" to "Source Sans Pro, sans-serif", "secondary" to "Herr Von Muellerhoff, cursive", "body" to "Cabin, sans-serif"),
        var breakpoint:Map<String, String> = mapOf("sm" to "576px", "md" to "768px", "lg" to "992px", "xl" to "1200px")

)
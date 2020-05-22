package com.mcmanus.webmaker.model

val apiImage = "/api/images/";

class Image(baseUrl: String, siteId: String, fileName: String?) {
        var original: String = "$baseUrl$apiImage$siteId/$fileName"
        var thumbnail: String = "$baseUrl$apiImage$siteId/thumbnail/$fileName"
        var name: String? = fileName
}


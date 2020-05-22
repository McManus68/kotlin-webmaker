package com.mcmanus.webmaker.model

const val API_IMAGE = "/api/images/";

class Image(baseUrl: String, siteId: String, fileName: String?) {
        var original: String = "$baseUrl$API_IMAGE$siteId/$fileName"
        var thumbnail: String = "$baseUrl$API_IMAGE$siteId/thumbnail/$fileName"
        var name: String? = fileName
}


package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.Image
import org.springframework.web.multipart.MultipartFile

interface StorageService {

    fun store(siteId: String, file: MultipartFile, baseUrl: String) : Image

    fun getAll(siteId: String, baseUrl: String) : List<Image>

    fun get(siteId: String, imageName: String, thumbnail: Boolean) : ByteArray?

    fun deleteAll(siteId: String) : Unit

}
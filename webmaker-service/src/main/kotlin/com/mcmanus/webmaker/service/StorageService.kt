package com.mcmanus.webmaker.service

import org.springframework.web.multipart.MultipartFile
import java.io.File

interface StorageService {

    fun store(siteId: String, file: MultipartFile) : Unit

    fun getAll(siteId: String) : Array<File>?

    fun deleteAll(siteId: String) : Unit

}
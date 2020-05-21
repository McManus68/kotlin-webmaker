package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.service.StorageService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File

@Service
class StorageServiceImpl : StorageService {

    @Value("\${storage.folder}")
    lateinit var folder: String

    override fun store(siteId: String, file: MultipartFile) {
        val siteFolder = File(folder + File.separator + siteId)
        if (!siteFolder.exists()) siteFolder.mkdir()

        file.transferTo(File(siteFolder.absolutePath + File.separator + file.originalFilename))
    }

    override fun getAll(siteId: String): Array<File>? {
        val siteFolder = File(folder + File.separator + siteId)
        return siteFolder.listFiles()
    }

    override fun deleteAll(siteId: String) {
        val siteFolder = File(folder + File.separator + siteId)
        siteFolder.deleteRecursively()
    }
}
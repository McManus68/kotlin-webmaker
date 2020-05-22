package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.Image
import com.mcmanus.webmaker.service.StorageService
import com.mcmanus.webmaker.service.ThumbnailService
import org.apache.commons.io.IOUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.FileFilter
import java.io.FileInputStream
import java.io.FileOutputStream

@Service
class StorageServiceImpl : StorageService {

    @Value("\${storage.folder}")
    lateinit var path: String

    @Autowired
    lateinit var thumbnailService: ThumbnailService

    val thumbnailFolder = "thumbnail"

    override fun store(siteId: String, file: MultipartFile, baseUrl: String) : Image {
        // Create site folder if needed - idem for thumbnails folder
        val siteFolder = File("$path/$siteId")
        if (!siteFolder.exists()) siteFolder.mkdir()

        val thumbnailFolder = File("$path/$siteId/$thumbnailFolder")
        if (!thumbnailFolder.exists()) thumbnailFolder.mkdir()

        // Save Thumbnail
        val thumbnailImage = FileOutputStream(thumbnailFolder.absolutePath + '/' + file.originalFilename)
        thumbnailImage.write(thumbnailService.generate(file).toByteArray())

        // Save main image
        file.transferTo(File(siteFolder.absolutePath + '/' + file.originalFilename))

        return Image(baseUrl, siteId, file.originalFilename )
    }

    override fun getAll(siteId: String, baseUrl: String): List<Image> {
        val siteFolder = File("$path/$siteId")
        val files = siteFolder.listFiles(FileFilter { it.isFile && !it.isHidden }) ?: return emptyList()
        return files.map { image -> Image(baseUrl, siteId, image.name) }
    }

    override fun get(siteId: String, imageName: String, thumbnail: Boolean): ByteArray? {
        val file = if (thumbnail)  File("$path/$siteId/thumbnail/$imageName")
                   else            File("$path/$siteId/$imageName")

        val stream = FileInputStream(file)
        return IOUtils.toByteArray(stream)
    }

    override fun deleteAll(siteId: String) {
        val siteFolder = File("$path/$siteId")
        siteFolder.deleteRecursively()
    }
}
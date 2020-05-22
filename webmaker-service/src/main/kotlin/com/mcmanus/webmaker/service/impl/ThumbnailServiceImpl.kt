package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.service.ThumbnailService
import org.imgscalr.Scalr
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import java.io.File
import javax.imageio.ImageIO

@Service
class ThumbnailServiceImpl : ThumbnailService {

    val maxWidth = 250;

    override fun generate(file: MultipartFile) : ByteArrayOutputStream {
        val thumbOutput = ByteArrayOutputStream()
        var thumbImg: BufferedImage? = null
        val img: BufferedImage = ImageIO.read(file.inputStream)
        thumbImg = Scalr.resize(img, Scalr.Method.AUTOMATIC, Scalr.Mode.AUTOMATIC, maxWidth, Scalr.OP_ANTIALIAS)
        ImageIO.write(thumbImg, file.contentType?.split(File.separator)?.get(1), thumbOutput)
        return thumbOutput
    }
}
package com.mcmanus.webmaker.service

import org.springframework.web.multipart.MultipartFile
import java.io.ByteArrayOutputStream

interface ThumbnailService {

    fun generate(file: MultipartFile) : ByteArrayOutputStream

}
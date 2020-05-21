package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.service.StorageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("api/upload")
class FileUploadController {

    @Autowired
    lateinit var service: StorageService

    @PostMapping("/{siteId}")
    fun upload(@PathVariable siteId : String, @RequestParam("file") file: MultipartFile) {
        service.store(siteId, file)
    }
}
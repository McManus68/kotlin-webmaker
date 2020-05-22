package com.mcmanus.webmaker.controller

import com.mcmanus.webmaker.model.Image
import com.mcmanus.webmaker.service.StorageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

@RestController
@RequestMapping("api/images")
class ImageController {

    @Autowired
    lateinit var service: StorageService

    @PostMapping("/upload/{siteId}")
    fun upload(@PathVariable siteId : String, @RequestParam("file") file: MultipartFile) : Image {
        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        return service.store(siteId, file, baseUrl)
    }

    @GetMapping("/{siteId}/{imageName:.+}")
    @ResponseBody
    fun getImage(@PathVariable siteId : String, @PathVariable imageName : String) : ByteArray? {
        return service.get(siteId, imageName, false)
    }

    @GetMapping("/{siteId}/thumbnail/{imageName:.+}")
    @ResponseBody
    fun getThumbnail(@PathVariable siteId : String, @PathVariable imageName : String) : ByteArray? {
        return service.get(siteId, imageName, true)
    }

    @GetMapping("/{siteId}")
    fun getAll(@PathVariable siteId : String) : List<Image> {
        val baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()
        return service.getAll(siteId, baseUrl)
    }
}
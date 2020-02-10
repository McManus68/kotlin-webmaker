package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.persistence.repository.SiteRepository
import com.mcmanus.webmaker.service.SiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SiteServiceImpl : SiteService {

    @Autowired
    lateinit var repository: SiteRepository

    override fun getAll(userId: Long): List<Site> = repository.findByUserId(userId)
    override fun create(site: Site): Site = repository.save(site)
}
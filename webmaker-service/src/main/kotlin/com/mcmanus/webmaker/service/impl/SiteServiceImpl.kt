package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.Page
import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.persistence.repository.SiteRepository
import com.mcmanus.webmaker.service.SiteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SiteServiceImpl : SiteService {

    @Autowired
    lateinit var repository: SiteRepository
    override fun getAll(): List<Site> = repository.findAll()
    override fun get(id: String): Site = repository.findById(id).get()
    override fun create(site: Site): Site = repository.save(site)
    override fun delete(id: String) = repository.deleteById(id)

    override fun getInfo(id: String): Site {
        var site: Site = repository.findById(id).get();
        site.pages = null
        return site
    }

    override fun getPages(id: String): List<Page>? = repository.findById(id).get().pages
}
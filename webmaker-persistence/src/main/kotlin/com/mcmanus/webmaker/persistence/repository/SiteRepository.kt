package com.mcmanus.webmaker.persistence.repository

import com.mcmanus.webmaker.model.Site
import org.springframework.data.mongodb.repository.MongoRepository

interface SiteRepository : MongoRepository<Site, String> {
}
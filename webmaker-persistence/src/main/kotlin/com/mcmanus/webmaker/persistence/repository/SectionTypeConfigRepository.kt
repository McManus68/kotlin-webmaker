package com.mcmanus.webmaker.persistence.repository

import com.mcmanus.webmaker.model.SectionTypeConfig
import org.springframework.data.mongodb.repository.MongoRepository

interface SectionTypeConfigRepository : MongoRepository<SectionTypeConfig, String> {
}
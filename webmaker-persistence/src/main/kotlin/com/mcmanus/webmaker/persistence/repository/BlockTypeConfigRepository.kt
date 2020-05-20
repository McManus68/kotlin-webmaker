package com.mcmanus.webmaker.persistence.repository

import com.mcmanus.webmaker.model.BlockTypeConfig
import org.springframework.data.mongodb.repository.MongoRepository

interface BlockTypeConfigRepository : MongoRepository<BlockTypeConfig, String> {
}
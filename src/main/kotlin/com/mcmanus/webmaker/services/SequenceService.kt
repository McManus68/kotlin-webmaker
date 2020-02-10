package com.mcmanus.webmaker.services

import com.mcmanus.webmaker.model.Sequence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.FindAndModifyOptions.options
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.data.mongodb.core.query.Query.query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.stereotype.Service
import java.util.*

@Service
class SequenceService {

    @Autowired
    lateinit var mongoOperations: MongoOperations

    fun generate(seqName: String): Long {
        val counter = mongoOperations.findAndModify(query(where("_id").`is`(seqName)),
                Update().inc("seq", 1), options().returnNew(true).upsert(true),
                Sequence::class.java)
        return if (!Objects.isNull(counter)) counter!!.seq else 1
    }
}
package com.mcmanus.webmaker.repository

import com.mongodb.BasicDBObjectBuilder
import com.mongodb.DBObject
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest
import org.springframework.data.mongodb.core.MongoTemplate

@DataMongoTest
@SpringBootConfiguration
@EnableAutoConfiguration
class SiteRepositoryTest {

    @Autowired
    lateinit var mongoTemplate: MongoTemplate

    @Test
    fun test() { // given
        val objectToSave = BasicDBObjectBuilder.start()
                .add("key", "value")
                .get()
        // when
        mongoTemplate.save(objectToSave, "collection")
        // then
        Assertions.assertThat(mongoTemplate.findAll(DBObject::class.java, "collection")).extracting("key")
                .containsOnly("value")
    }
}
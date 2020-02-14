package com.mcmanus.webmaker.repository

import com.mcmanus.webmaker.model.Site
import org.assertj.core.api.Assertions.assertThat
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
    fun should_be_able_to_create_a_simple_site() {
        val site = Site(1L, "test", "Site title", 1L, emptyList())

        mongoTemplate.save(site, "site")

        assertThat(mongoTemplate.findAll(Site::class.java, "site")).extracting("title")
                .containsOnly("Site title")
    }
}
package com.mcmanus.webmaker.persistence.listener

import com.mcmanus.webmaker.model.Site
import com.mcmanus.webmaker.persistence.service.SequenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent
import org.springframework.stereotype.Component


@Component
class SiteModelListener : AbstractMongoEventListener<Site>() {

    val sequenceName = "users_sequence"

    @Autowired
    lateinit var sequenceService: SequenceService

    override fun onBeforeConvert(event: BeforeConvertEvent<Site>) {
        if (event.source.id < 1) {
            event.source.id = sequenceService.generate(sequenceName)
        }
    }

}
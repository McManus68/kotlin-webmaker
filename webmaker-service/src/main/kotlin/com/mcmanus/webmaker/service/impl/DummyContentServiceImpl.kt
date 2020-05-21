package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.Animation
import com.mcmanus.webmaker.model.Block
import com.mcmanus.webmaker.model.BlockType
import com.mcmanus.webmaker.model.Page
import com.mcmanus.webmaker.model.Responsive
import com.mcmanus.webmaker.model.Row
import com.mcmanus.webmaker.model.Section
import com.mcmanus.webmaker.model.SectionType
import com.mcmanus.webmaker.service.DummyContentService
import org.springframework.stereotype.Service

@Service
class DummyContentServiceImpl : DummyContentService {
    override fun createDummyPage(): Page {

        val responsive = Responsive(4, 4, 4, 4)

        val block = Block(BlockType.BLOCK_SIMPLE_CONTENT, "classes",
                mapOf("title" to "t", "subtitle" to "s", "buttonText" to "b", "images" to listOf("img1", "img2")), responsive, Animation())

        val row = Row("row", listOf(block))

        val section = Section(SectionType.SECTION_CUSTOM,
                mapOf("title" to "t", "subtitle" to "s", "image" to "i", "overlay" to "o") , listOf(row))

        return Page("DUMMY_PAGE", "slug", "description", listOf(section));
    }
}
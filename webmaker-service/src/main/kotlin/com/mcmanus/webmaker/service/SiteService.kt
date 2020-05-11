package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.Site

interface SiteService {

    fun getAll() : List<Site>
    fun create(site : Site): Site
    fun deleteAll(): Unit
}
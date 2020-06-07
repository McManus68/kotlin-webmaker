package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.Site

interface SiteService {

    fun getAll() : List<Site>
    fun get(id: String) : Site
    fun create(site : Site): Site
    fun update(site : Site): Site
    fun delete(id: String): Unit
}
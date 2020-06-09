package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.Config

interface ConfigService {

    fun getAll() : Config
}
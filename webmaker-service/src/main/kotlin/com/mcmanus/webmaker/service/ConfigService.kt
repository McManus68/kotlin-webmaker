package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.ConfigType
import com.mcmanus.webmaker.model.Param

interface ConfigService {

    fun getConfig() : Map<ConfigType, Map<String, List<Param>?>?>
    fun getSitesConfig(): Map<String, List<Param>?>?
    fun getPagesConfig(): Map<String, List<Param>?>?
    fun getSectionsConfig(): Map<String, List<Param>?>?
    fun getBlocksConfig(): Map<String, List<Param>?>?

}
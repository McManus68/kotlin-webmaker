package com.mcmanus.webmaker.services

import com.mcmanus.webmaker.model.User

interface UserService {

    fun leaders() : List<User>
}
package com.mcmanus.webmaker.service

import com.mcmanus.webmaker.model.User

interface UserService {

    fun leaders() : List<User>
}
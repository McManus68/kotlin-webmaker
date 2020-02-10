package com.mcmanus.webmaker.service.impl

import com.mcmanus.webmaker.model.User
import com.mcmanus.webmaker.persistence.repository.UserRepository
import com.mcmanus.webmaker.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    lateinit var repository: UserRepository

    override fun leaders(): List<User> = repository.findTop3ByOrderByMailDesc()
}
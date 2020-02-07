package com.mcmanus.webmaker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {

    @Id
    var id: Long = 0;
    var mail: String = "";
    var phone: String = "";
}

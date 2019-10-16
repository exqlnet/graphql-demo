package com.ncuos.passport.infocenter.model

import lombok.Data
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn

@Entity
class User : BaseModel() {

    lateinit var name: String

    lateinit var pwdHash: String

    lateinit var username: String

}

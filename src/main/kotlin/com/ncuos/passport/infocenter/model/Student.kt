package com.ncuos.passport.infocenter.model

import javax.persistence.Entity

@Entity
class Student : BaseModel() {

    lateinit var xm: String

    lateinit var xb: String

    lateinit var sfzh: String

    lateinit var ksh: String

    lateinit var yddh: String

    lateinit var qsh: String

}

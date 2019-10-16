package com.ncuos.passport.infocenter.model

import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class TermClass : BaseModel() {

    @ManyToOne
    lateinit var term : Term

    @ManyToOne
    lateinit var clazz: Clazz
}

package com.ncuos.passport.infocenter.model

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Table(name = "class_info")
@Entity
class Clazz : BaseModel() {

    lateinit var name : String

    @ManyToOne
    @JoinColumn(name = "term_id")
    lateinit var startTerm : Term

}

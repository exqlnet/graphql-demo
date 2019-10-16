package com.ncuos.passport.infocenter.model

import javax.persistence.Entity
import javax.persistence.Index
import javax.persistence.Table

@Table(name = "system_term", indexes = [Index(name = "idx_xqdm", columnList = "xqdm")])
@Entity
class Term : BaseModel(){

    lateinit var xqdm : String

    lateinit var startAt : String

    lateinit var endAt : String
}

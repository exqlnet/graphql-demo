package com.ncuos.passport.infocenter.model

import io.ebean.Model
import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.time.Instant
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseModel : Model(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id : Long = 0

    @WhenModified
    lateinit var updateAt: Instant

    @WhenCreated
    lateinit var createAt: Instant
}


package com.ncuos.passport.infocenter.repository

import com.ncuos.passport.infocenter.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Int>{

    fun findStudentById(id: Long): Student
}

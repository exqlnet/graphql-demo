package com.ncuos.passport.infocenter.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.ncuos.passport.infocenter.model.Student
import com.ncuos.passport.infocenter.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class QueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var studentRepository: StudentRepository

    fun name() : String {
        return "licong"
    }

    fun student(id: Int) : Student{
        return studentRepository.findStudentById(id.toLong())
    }

    fun allStudents() : List<Student>{
        return studentRepository.findAll()
    }
}

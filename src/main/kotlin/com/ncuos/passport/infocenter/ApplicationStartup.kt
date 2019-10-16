package com.ncuos.passport.infocenter

import com.ncuos.passport.infocenter.model.Student
import com.ncuos.passport.infocenter.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import java.io.BufferedReader
import java.io.FileReader
import java.lang.IllegalStateException

@Component
class ApplicationSartup : ApplicationListener<ApplicationReadyEvent>{

    @Autowired
    lateinit var studentRepository: StudentRepository

    override fun onApplicationEvent(p0: ApplicationReadyEvent) {
        val reader = BufferedReader(FileReader("data/students.csv"))
        var line : String = reader.readLine()
        while(line != null){
            val propertyList : List<String> = line.split(",")
            val student : Student = Student()
            student.xm = propertyList[0]
            student.xb = propertyList[1]
            student.sfzh = propertyList[2]
            student.ksh = propertyList[3]
            student.yddh = propertyList[4]
            student.qsh = propertyList[5]
            studentRepository.save(student)
            println(student)
            try {
                line = reader.readLine()
            }catch (e : IllegalStateException){
                break
            }
        }
    }
}

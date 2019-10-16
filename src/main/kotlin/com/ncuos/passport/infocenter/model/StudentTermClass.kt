package com.ncuos.passport.infocenter.model

import javax.persistence.*


@Table(
        name = "student_term_class",
        uniqueConstraints = [UniqueConstraint(columnNames = ["student_id", "term_class_id"])],
        indexes = [Index(name = "pk_id_term_class", columnList = "student_id,term_class_id")]
)
@Entity
class StudentTermClass : BaseModel() {

    @JoinColumn(name = "student_id")
    @ManyToOne
    lateinit var student: Student

    @JoinColumn(name = "term_class_id")
    @ManyToOne
    lateinit var termClass: TermClass
}

package com.example.roomrelations.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomrelations.entities.Student
import com.example.roomrelations.entities.Subject

data class StudentWithSubjects (
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subject : List<Subject>
    )
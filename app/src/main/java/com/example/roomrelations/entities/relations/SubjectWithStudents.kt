package com.example.roomrelations.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomrelations.entities.Student
import com.example.roomrelations.entities.Subject

data class SubjectWithStudents (
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students : List<Student>
)
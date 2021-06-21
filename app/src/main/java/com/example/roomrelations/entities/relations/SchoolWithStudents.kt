package com.example.roomrelations.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomrelations.entities.School
import com.example.roomrelations.entities.Student


// one to N -> one School to N Students
data class SchoolWithStudents (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolname",
        entityColumn = "schoolname"
    )
    val students : List<Student>
    )
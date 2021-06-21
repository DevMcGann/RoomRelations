package com.example.roomrelations.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(
    val studentName : String,
    val subjectName : String
)
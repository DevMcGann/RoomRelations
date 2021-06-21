package com.example.roomrelations.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomrelations.entities.Director
import com.example.roomrelations.entities.School


// relacion one to one
data class SchoolAndDirector (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val directo: Director
    )
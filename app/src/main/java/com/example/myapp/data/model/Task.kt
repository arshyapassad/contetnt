package com.example.myapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_task")
data class Task(
    val Name: String,
    val number: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long=0
}

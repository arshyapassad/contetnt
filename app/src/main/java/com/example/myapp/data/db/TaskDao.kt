package com.example.myapp.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.myapp.data.model.Task

@Dao
interface TaskDao {

    @Insert
    fun InsertTask(task: Task)

    @Delete
    fun DeleteTask(task: Task)
}
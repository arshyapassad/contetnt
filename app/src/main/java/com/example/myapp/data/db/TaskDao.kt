package com.example.myapp.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapp.data.model.Task
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Insert
    fun InsertTask(task: Task)

    @Delete
    fun DeleteTask(task: Task)

    @Query("SELECT * FROM tbl_task")
    fun getTasks(): Flow<List<Task>>
}
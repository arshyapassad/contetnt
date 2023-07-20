package com.example.myapp.data.repository.HomeRepository

import com.example.myapp.data.model.Task
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    fun InsertTask(task: Task)

    fun DeleteTask(task: Task)

    fun getTasks():Flow<List<Task>>
}
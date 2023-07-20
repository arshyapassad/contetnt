package com.example.myapp.data.repository.HomeRepository

import com.example.myapp.data.model.Task

interface HomeRepository {
    fun InsertTask(task: Task)

    fun DeleteTask(task: Task)
}
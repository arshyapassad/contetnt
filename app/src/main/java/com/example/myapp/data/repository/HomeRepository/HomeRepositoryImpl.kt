package com.example.myapp.data.repository.HomeRepository

import com.example.myapp.data.db.AppDatabase
import com.example.myapp.data.model.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(val appDatabase: AppDatabase): HomeRepository {

    override fun InsertTask(task: Task) {
        appDatabase.taskDao().InsertTask(task)
    }

    override fun DeleteTask(task: Task) {
        appDatabase.taskDao().DeleteTask(task)
    }

    override fun getTasks(): Flow<List<Task>> = appDatabase.taskDao().getTasks()
}
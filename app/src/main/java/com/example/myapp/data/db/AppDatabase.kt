package com.example.myapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapp.data.model.Task

@Database(entities = [Task::class], version = 1 )
abstract class AppDatabase : RoomDatabase(){
    abstract fun taskDao() : TaskDao
}
package com.example.myapp.ui.home

import androidx.lifecycle.ViewModel
import com.example.myapp.data.model.Task
import com.example.myapp.data.repository.HomeRepository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository):ViewModel(){
    fun InsertTask(task: Task){
        homeRepository.InsertTask(task)
    }
    fun DeleteTask(task: Task){
        homeRepository.DeleteTask(task)
    }
}
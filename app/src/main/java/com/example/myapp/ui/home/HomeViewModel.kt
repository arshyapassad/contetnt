package com.example.myapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
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
    fun getTasks():LiveData<List<Task>> = liveData {
       emitSource(homeRepository.getTasks().asLiveData())
    }
}
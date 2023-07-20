package com.example.myapp.data.di.RepositoryModule

import com.example.myapp.data.repository.HomeRepository.HomeRepository
import com.example.myapp.data.repository.HomeRepository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepositoryHome(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository
}
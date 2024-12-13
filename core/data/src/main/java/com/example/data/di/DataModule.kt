package com.example.data.di

import com.example.data.repository.DefaultMovieRepository
import com.example.data.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    internal abstract fun bindsMovieRepository(
        movieRepository: DefaultMovieRepository
    ): MovieRepository
}
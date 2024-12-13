package com.example.data.repository

import com.example.model.data.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    suspend fun getTrendingMovies(): List<Movie>
}
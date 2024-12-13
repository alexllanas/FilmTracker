package com.example.data.repository

import com.example.model.data.Movie
import com.example.network.FTNetworkDataSource
import javax.inject.Inject

class DefaultMovieRepository @Inject constructor(
    private val network: FTNetworkDataSource
) : MovieRepository {

    override suspend fun getTrendingMovies(): List<Movie> =
        network.getTrendingMovies().results.map {
            Movie(
                title = it.title
            )
        }
}
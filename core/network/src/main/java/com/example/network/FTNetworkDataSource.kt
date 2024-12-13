package com.example.network

import com.example.network.model.NetworkMovieList

interface FTNetworkDataSource {

    suspend fun getTrendingMovies(): NetworkMovieList

}
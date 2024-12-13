package com.example.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkMovieList(
    val results: List<NetworkMovie> = listOf()
)
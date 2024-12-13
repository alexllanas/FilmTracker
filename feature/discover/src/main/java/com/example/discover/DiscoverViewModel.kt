package com.example.discover

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.repository.MovieRepository
import com.example.model.data.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DiscoverViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) : ViewModel() {

    val uiState: StateFlow<DiscoverUiState> =

    fun getTrendingMovies(): List<Movie> =
        viewModelScope.launch {
            movieRepository.getTrendingMovies()
        }

}
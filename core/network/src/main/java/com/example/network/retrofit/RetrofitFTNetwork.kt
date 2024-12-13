package com.example.network.retrofit


import com.example.network.BuildConfig
import com.example.network.FTNetworkDataSource
import com.example.network.model.NetworkMovieList
import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import javax.inject.Inject
import javax.inject.Singleton

private const val TMDB_BASE_URL = BuildConfig.TMDB_BASE_URL

private interface RetrofitRJNetworkApi {

    @GET(value = "trending/movie")
    suspend fun getTrendingMovies(): List<NetworkMovieList>
}

@Singleton
internal class RetrofitFTNetwork @Inject constructor(
    okhttpCallFactory: dagger.Lazy<Call.Factory>
): FTNetworkDataSource {

    private val networkApi =
        Retrofit.Builder()
            .baseUrl(TMDB_BASE_URL)
            .callFactory { okhttpCallFactory.get().newCall(it) }
            .build()
            .create(RetrofitRJNetworkApi::class.java)

    override suspend fun getTrendingMovies(): List<NetworkMovieList> =
        networkApi.getTrendingMovies()
}
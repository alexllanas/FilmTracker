package com.example.network.di

import com.example.network.BuildConfig
import com.example.network.FTNetworkDataSource
import com.example.network.retrofit.RetrofitFTNetwork
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface NetworkModule {

    @Binds
    @RealNetwork
    fun bindRealNetworkDataSource(impl: RetrofitFTNetwork): FTNetworkDataSource
}


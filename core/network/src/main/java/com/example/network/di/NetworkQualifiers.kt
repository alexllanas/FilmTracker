package com.example.network.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class RealNetwork

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FakeNetwork


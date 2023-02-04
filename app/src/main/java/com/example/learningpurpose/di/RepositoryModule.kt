package com.example.learningpurpose.di

import com.example.learningpurpose.repository.ListRepository
import com.example.learningpurpose.retrofit.listApiCall
import com.example.learningpurpose.room.listCache
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RepositoryModule {

    @Provides
    fun providesRepository(
        listApiCall: listApiCall
        /*listCacheCall: listCache*/
    ): ListRepository {
        return ListRepository(listApiCall /*listCacheCall*/)

    }
}
package com.example.learningpurpose.di

import com.example.learningpurpose.retrofit.listApiCall
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    fun provideRetrofit(retrofit : Retrofit.Builder): listApiCall{
        return retrofit.build().create(listApiCall::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder() : Retrofit.Builder{
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder().addInterceptor(logging)
        return Retrofit
            .Builder()
            .baseUrl("https://food2fork.ca/api/receipe/")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .client(httpClient.build())

    }
}
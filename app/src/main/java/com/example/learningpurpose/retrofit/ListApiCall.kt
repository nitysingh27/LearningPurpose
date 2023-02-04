package com.example.learningpurpose.retrofit

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface listApiCall {


    @GET("/recipe/search")
    suspend fun getRecipe(
        @Header("Authorization") token: String,
        @Query("page") page: Int, @Query("query") query: String
    ): JsonObject

    suspend fun getRecipeListfromApi()

}

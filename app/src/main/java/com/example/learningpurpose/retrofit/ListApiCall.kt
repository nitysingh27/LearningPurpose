package com.example.learningpurpose.retrofit

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface listApiCall {

@Headers("Authorization:Token 9c8b06d329136da358c2d00e76946b0111ce2c48")
@GET("/recipe/search")
suspend fun getRecipe(@Query("page") page : Int,@Query ("query")query: String) :JsonObject

suspend fun getRecipeListfromApi()

}

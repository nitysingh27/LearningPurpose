package com.example.learningpurpose.repository


import android.content.ContentValues.TAG
import android.util.Log
import com.example.learningpurpose.retrofit.listApiCall
import com.example.learningpurpose.room.listCache
import retrofit2.Response


class ListRepository
constructor(
    private var retroCall: listApiCall
    /*, private var cacheCall: listCache*/
) {

    suspend fun getRecipeFromRepo(): List<String> {
        val responseFromApi =
            retroCall.getRecipe("Token 9c8b06d329136da358c2d00e76946b0111ce2c48", 0, "")
        Log.d(TAG, "getRecipeFromRepo: $responseFromApi")
        return ArrayList()

    }


}
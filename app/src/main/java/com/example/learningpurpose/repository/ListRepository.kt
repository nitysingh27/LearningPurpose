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
            retroCall.getRecipe( 1, "")
        Log.d(TAG, "getRecipeFromRepo: $responseFromApi")
        return ArrayList()

    }


}
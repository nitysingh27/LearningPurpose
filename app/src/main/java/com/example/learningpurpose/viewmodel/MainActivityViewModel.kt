package com.example.learningpurpose.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learningpurpose.repository.ListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel
@Inject
constructor(
    private val listFromRepo: ListRepository
) : ViewModel() {

    var listSize: MutableState<List<String>?> = mutableStateOf(null)

    fun getList() {
        viewModelScope.launch(Dispatchers.IO) {
            listFromRepo.getRecipeFromRepo()
        }

    }


}
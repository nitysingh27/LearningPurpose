package com.example.learningpurpose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learningpurpose.ui.theme.LearningPurposeTheme
import com.example.learningpurpose.viewmodel.MainActivityViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

   // lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

       // viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        super.onCreate(savedInstanceState)
        setContent {
            LearningPurposeTheme {



                DefaultPreview()
            }
        }
    }
}


@Composable
fun DefaultPreview(
    viewModel: MainActivityViewModel = hiltViewModel()
) {
    LaunchedEffect(key1 = true, block = {viewModel.getList()} )

    LearningPurposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray)
                .absolutePadding(10.dp, 10.dp, 10.dp, 10.dp)
        ) {
            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)) {
                items(count = 0 /*viewModel.listSize.value?.size?:0*/ ) {

                }


            }

        }
    }
}



package com.golfpvcc.todo
// Building an Android To-Do App with Jetpack Compose
// https://www.youtube.com/watch?v=0wjnk62I01c&list=PLh_eiHw2h9hmAMt6q8v9hsYyq9upQGCi4
// https://github.com/skyFishLLC/TodoYoutubeTutorial/tree/c251b2bf89ecf8d4955e45e05323ba6955af4bdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.golfpvcc.todo.ui.theme.ToDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


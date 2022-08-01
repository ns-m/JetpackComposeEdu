package com.kmv.jetpackcomposeedu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kmv.jetpackcomposeedu.ui.theme.JetpackComposeEduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*NewText()*/
            Column {
                Text(text = "Test! Col-1")
                Text(text = "Test! Col-22")
                Text(text = "Test! Col-333")
            }
            Row(
                modifier = Modifier.background(Color.LightGray).fillMaxSize()
            ) {
                Text(text = "Test! Row-1")
                Text(text = "Test! Row-22")
                Text(text = "Test! Row-333")
            }
        }
    }
}

/*
@Preview (showBackground = true)
@Composable
fun NewText(){
    Text(text = "Test! test")
}*/

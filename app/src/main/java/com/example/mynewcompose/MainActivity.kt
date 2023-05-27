package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Preview(
    name = "Preview Robot",
    widthDp = 200,
    heightDp = 50,
    locale = "en",
    showSystemUi = true,
    showBackground = true,
    apiLevel = 29,
    device = Devices.PIXEL_3
)
@Composable
fun SuperText(){
    MySuperText(title = "I'm Robot :3")
}

@Composable
fun MySuperText(title:String){
    Text(text = title)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyNewComposeTheme {
        Greeting("Android")
    }
}
package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background
                ) {
                    ImagePreview("JetPack Compose Tutorial", "Jetpack Compose is a modern toolkit for building native Android UI.Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." , "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor.Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest. Compose is built around composable functions.nThese functions let you define your apps UI programmatically by describing how it should look and providing data dependencies, rather than focusing on the process of the UI's construction (initializing an element, attaching it to a parent, etc.).To create a composable function, just add the @Composable annotation to the function name.")
                }
            }
        }
    }
}
@Composable
fun ImagePreview ( title : String,first:String, second:String, modifier: Modifier = Modifier ) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column (
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxWidth()
        )
        ShowInformation(
            title = title,
            first = first,
            second = second,
            modifier = modifier.background(Color.White)
        )
    }


}




@Composable
fun ShowInformation (title: String, first: String, second:String, modifier: Modifier = Modifier) {

     Column {
         //titre
        Text(
            text = title,
            fontSize = 24.sp,
            lineHeight = 116.sp,
            modifier = modifier.padding(16.dp)
             )
        Text(
            text = first,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(
                start=16.dp,
                end=16.dp
            )

        )
        Text(
            text =second,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun TogetherPreview() {
    ImagePreview("JetPack Compose Tutorial", "Jetpack Compose is a modern toolkit for building native Android UI.Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." , "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor.Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest. Compose is built around composable functions.nThese functions let you define your apps UI programmatically by describing how it should look and providing data dependencies, rather than focusing on the process of the UI's construction (initializing an element, attaching it to a parent, etc.).To create a composable function, just add the @Composable annotation to the function name.")

}


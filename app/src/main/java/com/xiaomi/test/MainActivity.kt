package com.xiaomi.test

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xiaomi.test.ui.theme.TestDemoTheme
import java.lang.reflect.Proxy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
               Cloumn()
        }

    }

}



@Composable
fun ForeMore(/*onclick:()->Unit*/){
    val context= LocalContext.current

    Row (modifier = Modifier.background(Color.Red).padding(10.dp).height(200.dp).layoutId(11)){
        Text(
            text = "zhang san", color = Color.White, modifier = Modifier.weight(1f)
            , fontSize = 16.sp,
        )
        Button(onClick = {} ) {
            Text(text = "show" , fontSize = 16.sp , color = Color.Red)
        }
    }
}


@Composable
fun Cloumn(){
    for (i in 1..10){
        ForeMore()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF00FF00, widthDp = 150, heightDp = 1000)
@Composable
fun GreetingPreview() {
    TestDemoTheme {
       Cloumn()
    }
}
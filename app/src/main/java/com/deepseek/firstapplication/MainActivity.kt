package com.deepseek.firstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.deepseek.firstapplication.screens.dashboard.DashboardScreen
import com.deepseek.firstapplication.screens.demo.BoxScreen
import com.deepseek.firstapplication.screens.demo.FirstScreen
import com.deepseek.firstapplication.screens.demo.MyCard
import com.deepseek.firstapplication.screens.homescreen.HomeCard
import com.deepseek.firstapplication.screens.login.LoginScreen
import com.deepseek.firstapplication.screens.register.RegisterScreen
import com.deepseek.firstapplication.ui.theme.FirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DashboardScreen()
        }
    }
}

@Composable
fun demo(){
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Hello! Good afternoon!",
            color = Color.Magenta,
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "This is my first app.",
            color= Color.Cyan,
            fontSize = 22.sp,
            fontWeight = FontWeight.ExtraLight
        )
    }

}

@Preview(showBackground = true)
@Composable
fun demopreview(){
    demo()
}
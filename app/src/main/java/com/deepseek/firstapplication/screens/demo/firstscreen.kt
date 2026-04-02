package com.deepseek.firstapplication.screens.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepseek.firstapplication.R

@Composable
fun FirstScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        .padding(20.dp),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement =Arrangement.Center ) {
        Text(
            text = "Welcome to Pendo's app!",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Cyan,
        )
        Spacer(modifier = Modifier.height(24.dp))
        Image(painterResource(id=R.drawable.logo2),
            contentDescription = "company logo",
            modifier = Modifier
                .size(200.dp)
                .fillMaxSize()
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(24.dp))
        //row
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            //two buttons
            Button(onClick = {}) {
                Text("Login")
            }
            Button(onClick = {}) {
                Text("Register")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun firstscreenpreview(){
    FirstScreen()
}
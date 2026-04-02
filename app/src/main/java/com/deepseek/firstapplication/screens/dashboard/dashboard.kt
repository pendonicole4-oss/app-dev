package com.deepseek.firstapplication.screens.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.deepseek.firstapplication.screens.homescreen.HomeCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    Scaffold(
        //topbar
        topBar = {
            TopAppBar(
                title = { Text("Welcome to my app!") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Yellow,
                    titleContentColor = Color.Black
                ),
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Default.Settings,
                            contentDescription = "icon"
                        )
                    }
                }

            )
        },
        //bottom bar
        bottomBar = {
            //   BottomAppBar(
            //      containerColor = Color(0xFFB6C1),
            //      contentColor = Color.White
            //    ) {
            //     Text("Bottom bar")
            //  }
            NavigationBar() {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "home icon")
                    },
                    label = { Text("HOME") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Default.Settings, contentDescription = "setings icon")
                    },
                    label = { Text("Settings") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Default.Person, contentDescription = "profile icon")
                    },
                    label = { Text("Settings") }
                )
            }

        },

        //floating action button
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "add icon")
            }
        }
    ){innerpadding ->
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,

        ) {
            HomeCard("Welcome!",Color.Gray)

        }
    }

}



@Preview(showBackground = true)
@Composable
fun dashboardpreview(){
    DashboardScreen()
}
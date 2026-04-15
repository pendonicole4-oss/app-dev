package com.deepseek.firstapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.deepseek.firstapplication.screens.login.LoginScreen
import androidx.navigation.compose.composable
import com.deepseek.firstapplication.screens.dashboard.DashboardScreen
import com.deepseek.firstapplication.screens.demo.IntentScreen
import com.deepseek.firstapplication.screens.register.RegisterScreen
import com.deepseek.firstapplication.screens.splashscreen.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier= Modifier,
    navController: NavHostController= rememberNavController() ,
    startDestination: String=ROUTE_SPLASH

){
    NavHost(navController=navController,
        modifier=modifier,
        startDestination=startDestination
    ){
       composable (ROUTE_LOGIN) {
           LoginScreen(navController)
       }
      composable (ROUTE_REGISTER) {
          RegisterScreen(navController)

        }
        composable(ROUTE_DASHBOARD){
            DashboardScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_MYINTENTS){
            IntentScreen(navController)
        }

    }
}
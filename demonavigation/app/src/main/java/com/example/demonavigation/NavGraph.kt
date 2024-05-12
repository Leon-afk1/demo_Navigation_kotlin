package com.example.demonavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Nav(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "1" ){
        composable("1"){
            Screen1(navController)
        }
        composable("2"){
            Screen2(navController)
        }
    }
}
package com.example.demonavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Screen2(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()
        , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 2", fontSize = 64.sp)
        Spacer(modifier = Modifier.height(45.dp))
        Button(onClick = {

            navController.navigate("1")
        }) {
            Text(text = "Go to screen 1", fontSize = 40.sp)
        }

    }
}
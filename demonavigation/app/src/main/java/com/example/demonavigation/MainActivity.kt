package com.example.demonavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.demonavigation.ui.theme.DemonavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemonavigationTheme {
                val navController = rememberNavController()
                Nav(navController)
            }
        }
    }
}

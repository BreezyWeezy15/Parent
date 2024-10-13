package com.app.lockcompose



import ShowAppList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.lockcompose.ui.theme.LockComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LockComposeTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "showAppList") {
                    composable("showAppList") { ShowAppList() }
                }
            }
        }
    }

}

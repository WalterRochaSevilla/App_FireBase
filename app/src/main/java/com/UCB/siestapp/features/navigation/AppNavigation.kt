package com.UCB.siestapp.features.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.UCB.siestapp.features.dollar.presentation.DollarScreen

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Dollar.route
    ) {
       /* composable(Screen.Github.route) {
            GithubScreen(modifier = Modifier)
        }*/
        composable(Screen.Home.route) {
        }
        /*composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.CardExamples.route) { CardScreen() }
        */
        composable(Screen.Dollar.route) {
            DollarScreen()
        }
    }
}

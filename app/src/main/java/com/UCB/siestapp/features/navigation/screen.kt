package com.UCB.siestapp.features.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object CardExamples : Screen("card")
    object Dollar : Screen("dollar")
}

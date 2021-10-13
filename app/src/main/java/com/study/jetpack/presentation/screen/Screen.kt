package com.study.jetpack.presentation.screen

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
}
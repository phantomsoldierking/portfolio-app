package com.example.composecamp.Navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object LangPage : Screen("lang_page")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
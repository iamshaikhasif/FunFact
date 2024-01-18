package com.example.funfactthemesapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.funfactthemesapplication.ui.screen.UserInputScreen
import com.example.funfactthemesapplication.ui.screen.WelcomeScreen
import com.example.funfactthemesapplication.ui.viewModel.UserInputViewModel
import com.example.funfactthemesapplication.utils.Routers

@Composable
fun funFactGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routers.USER_INOUT_SCREEN) {
        composable(Routers.USER_INOUT_SCREEN) {
            UserInputScreen(navController, UserInputViewModel())
        }

        composable(
            "${Routers.WELCOME_SCREEN}/{${Routers.USER_NAME}}/{${Routers.ANIMAL_NAME}}",
            arguments = listOf(
                navArgument(Routers.USER_NAME) { type = NavType.StringType },
                navArgument(Routers.ANIMAL_NAME) { type = NavType.StringType },
            )
        ) {
            val userName = it.arguments?.getString(Routers.USER_NAME) ?: ""
            val animalName = it.arguments?.getString(Routers.ANIMAL_NAME) ?: ""
            WelcomeScreen(navController, userName = userName, animalName = animalName)
        }
    }
}
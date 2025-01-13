package dev.mario.mariomendeztaller

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.mario.mariomendeztaller.Pantallas.HomeScreen
import dev.mario.mariomendeztaller.Pantallas.Index
import dev.mario.mariomendeztaller.Pantallas.addScreen

@Composable
fun NavigatorHostController(){
    var navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "index",
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        })
    {
        composable(route= "index"){ Index(navController) }
        composable(route= "home"){ HomeScreen(navController) }
        composable(route= "add"){ addScreen(navController) }
    }
}
package dev.bellu.hackathon_blockchain

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.bellu.hackathon_blockchain.framework.screens.HomeScreen
import dev.bellu.hackathon_blockchain.framework.screens.IssuanceScreen
import dev.bellu.hackathon_blockchain.navigation.Screens


@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route,
        builder = {
            composable(Screens.Home.route) { HomeScreen(navController) }
            composable(Screens.Issuance.route) { IssuanceScreen(navController) }
        }
    )
}
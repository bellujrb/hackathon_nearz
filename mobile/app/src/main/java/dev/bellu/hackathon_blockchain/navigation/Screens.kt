package dev.bellu.hackathon_blockchain.navigation

sealed class Screens(val route: String) {
    data object Home: Screens(route = "home")
    data object Issuance: Screens(route = "issuance")
}
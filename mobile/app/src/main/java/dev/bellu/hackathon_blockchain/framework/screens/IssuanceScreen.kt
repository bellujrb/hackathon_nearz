package dev.bellu.hackathon_blockchain.framework.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.bellu.hackathon_blockchain.framework.composables.ButtonSample
import dev.bellu.hackathon_blockchain.framework.composables.InputSample
import dev.bellu.hackathon_blockchain.framework.theme.Colors
import dev.bellu.hackathon_blockchain.navigation.Screens
import kotlinx.coroutines.delay

@Composable
fun IssuanceScreen(navController: NavController){

    LaunchedEffect(key1 = null){
        delay(3000)
        navController.navigate("success")
    }

    LazyColumn(
        modifier = Modifier
            .padding(16.dp)
    ) {
        item {
            Icon(
                modifier = Modifier
                    .size(32.dp)
                    .clickable { navController.navigate(Screens.Home.route) },
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(10.dp))
            InputSample(
                label = "Endereço HEX",
                placeholder = "Example: 0x4a3f9A1BcE78E39b0...",
            )
            InputSample(
                label = "Endereço Wallet",
                placeholder = "Example: 1Hw6vKeBTK9nS...",
            )
            InputSample(
                label = "Numero da Fatura",
                placeholder = "Example: 4325213EE",
            )
            InputSample(
                label = "Data da Fatura",
                placeholder = "Example: 2025/15/04",
            )
            InputSample(
                label = "Descriçao da Fatura",
                placeholder = "Example: Compra de Iphone 14 PLUS",
            )
            InputSample(
                label = "Quantidade de Items",
                placeholder = "Example: Banana(1), Uva(2).",
            )
            InputSample(
                label = "Valor dos Items",
                placeholder = "Example: Banana(1,40), Uva(2,58)..",
            )
            InputSample(
                label = "Total da Fatura",
                placeholder = "Example: R$ 353.23",
            )
            InputSample(
                label = "Taxa",
                placeholder = "Example: 4.5"
            )
            ButtonSample(
                title = "Emitir",
                backgroundColor = Colors.primary,
                onClick = {
                    navController.navigate("success")
                }
            )
        }
    }
}
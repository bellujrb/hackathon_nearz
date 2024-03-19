package dev.bellu.hackathon_blockchain.framework.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.hackathon_blockchain.R
import dev.bellu.hackathon_blockchain.framework.theme.Colors
import dev.bellu.hackathon_blockchain.framework.theme.TextManager
import kotlinx.coroutines.delay

@Composable
fun SuccessScreen(navController: NavController){

    LaunchedEffect(key1 = null){
        delay(5000)
        navController.navigate("home")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Colors.primary)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_success),
            modifier = Modifier.size(48.dp),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth(),
            content = {
                Text(
                    text = "NOTA FISCAL EMITIDA COM SUCESSO E REGISTRADA NA BLOCKCHAIN",
                    style = TextManager.smallWhite,
                    textAlign = TextAlign.Center
                )
            }
        )
    }
}
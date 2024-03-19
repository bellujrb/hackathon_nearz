package dev.bellu.hackathon_blockchain.framework.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.bellu.hackathon_blockchain.R

@Composable
fun HomeScreen(){
    Column(
        content = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(118.dp)
                    .fillMaxSize(),
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        modifier = Modifier
                            .height(80.dp)
                            .width(82.04.dp),
                        contentDescription = "Logo"
                    )
                },
            )
            Text(
                text = "Como deseja emitir a nota fiscal?",
            )
            Box(
                content = {

                },
                modifier = Modifier
                    .height(439.dp)
                    .fillMaxWidth(0.8f)
            )
        }
    )
}
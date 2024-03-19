package dev.bellu.hackathon_blockchain.framework.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.bellu.hackathon_blockchain.R
import dev.bellu.hackathon_blockchain.framework.composables.ButtonSample
import dev.bellu.hackathon_blockchain.framework.theme.Colors
import dev.bellu.hackathon_blockchain.framework.theme.TextManager
import dev.bellu.hackathon_blockchain.navigation.Screens

@Composable
fun HomeScreen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp),
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
                            .height(46.dp)
                            .width(184.4.dp),
                        contentDescription = "Logo"
                    )
                },
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Como deseja emitir a nota fiscal?",
                style = TextManager.bigBlack,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(190.dp)
                    .fillMaxWidth(1.0f)
                    .background(color = Colors.white30)
                    .clickable {
                        navController.navigate("issuance")
                    },
                content = {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxSize(),
                        content = {
                            Column(
                                modifier = Modifier
                                    .padding(12.dp)
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .size(56.dp)
                                        .background(color = Colors.white),
                                    content = {
                                        Icon(
                                            modifier = Modifier
                                                .size(24.dp),
                                            imageVector = Icons.Default.Edit,
                                            contentDescription = null
                                        )
                                    }
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Inputs Manual",
                                    style = TextManager.smallBlack
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Inserir por input para que a nota fiscal fosse emitida e adicionada no blockchain",
                                    style = TextManager.smallGray
                                )
                            }
                            Box(modifier = Modifier
                                .height(2.dp)
                                .fillMaxWidth()
                                .background(color = Colors.primary)
                            )
                        }
                    )
                },
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(1.0f)
                    .background(color = Colors.white30),
                content = {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxSize(),
                        content = {
                            Column(
                                modifier = Modifier
                                    .padding(12.dp)
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .size(56.dp)
                                        .background(color = Colors.white),
                                    content = {
                                        Icon(
                                            modifier = Modifier
                                                .size(24.dp),
                                            imageVector = Icons.Default.Build,
                                            contentDescription = null
                                        )
                                    }
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Integração automática",
                                    style = TextManager.smallBlack
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Com API própria em nosso plano premium, você pode integrá-la ao seu sistema de forma automática e instantânea assim que o usuário emitir a nota fiscal em sua plataforma\n",
                                    style = TextManager.smallGray
                                )
                            }
                            Box(modifier = Modifier
                                .height(2.dp)
                                .fillMaxWidth()
                                .background(color = Colors.primary)
                            )
                        }
                    )
                },
            )}
    )
}
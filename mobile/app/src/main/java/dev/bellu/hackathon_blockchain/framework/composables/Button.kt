package dev.bellu.hackathon_blockchain.framework.composables
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.bellu.hackathon_blockchain.framework.theme.TextManager
import java.lang.reflect.Modifier

@Composable
fun ButtonSample(
    title: String,
    backgroundColor: Color,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier
            .height(56.dp)
            .fillMaxWidth()
            .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            .clickable { onClick() },
        content = {
            Text(
                text = title,
                style = TextManager.smallWhite
            )
        }
    )
}
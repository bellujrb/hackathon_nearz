package dev.bellu.hackathon_blockchain.framework.composables
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.bellu.hackathon_blockchain.framework.theme.Colors
import dev.bellu.hackathon_blockchain.framework.theme.TextManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputSample(
    placeholder: String,
    label: String,
) {

    var text by remember {
        mutableStateOf("")
    }

    val colors = TextFieldDefaults.textFieldColors(
        containerColor = Colors.white,
        focusedLabelColor = Colors.primary,

        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent
    )


    Column {
        Text(
            text = label,
            style = TextManager.smallBlack
        )
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            colors = colors,
            placeholder = {
                Text(text = placeholder)
            },
            label = null,
            modifier = Modifier
                .width(400.dp)
                .padding(
                    top = 10.dp,
                    bottom = 10.dp
                )
        )
    }
}
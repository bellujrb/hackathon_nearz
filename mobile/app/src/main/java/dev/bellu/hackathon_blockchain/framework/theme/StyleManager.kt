package dev.bellu.hackathon_blockchain.framework.theme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val defaultFontFamilly = FontFamily(
    Font(dev.bellu.hackathon_blockchain.R.font.chakra_petch_light, FontWeight.Light),
    Font(dev.bellu.hackathon_blockchain.R.font.chakra_petch_regular, FontWeight.Normal),
    Font(dev.bellu.hackathon_blockchain.R.font.chakra_petch_medium, FontWeight.Medium),
    Font(dev.bellu.hackathon_blockchain.R.font.chakra_petch_semibold, FontWeight.SemiBold),
    Font(dev.bellu.hackathon_blockchain.R.font.chakra_petch_bold, FontWeight.Bold),
)
object TextManager{
    val smallBlack = TextStyle(
        fontFamily = defaultFontFamilly,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Colors.black30
    )
    val bigBlack = TextStyle(
        fontFamily = defaultFontFamilly,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = Colors.black30
    )
    val smallGray = TextStyle(
        fontFamily = defaultFontFamilly,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = Colors.gray
    )
}
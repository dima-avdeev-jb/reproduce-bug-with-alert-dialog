import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@OptIn(ExperimentalMaterialApi::class)
fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Box(Modifier.fillMaxSize().background(Color.Gray)) {
            MaterialTheme {
                AlertDialog(
                    onDismissRequest = {},
                    buttons = {},
                    text = { Text("AlertDialog") },
                    shape = RoundedCornerShape(20.dp),
                    backgroundColor = Color.Blue
                )
            }
        }
    }
}

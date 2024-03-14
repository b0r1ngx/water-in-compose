import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

val color = Color(0xFF14d5c1)

@Composable
fun Water(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val points = buildList {
            for (i in -50..50) {
                add(Offset(
                    x = center.x + i * 100f,
                    y = center.y
                ))
            }
        }
        points.forEach {
            drawCircle(
                color = color,
                radius = 10f,
                center = it
            )
        }
    }
}
package id.ackerman.stevdzacompose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ackerman.stevdzacompose.ui.theme.StevdzaComposeTheme

@Composable
fun LearnRow() {

    Row(
        modifier = Modifier
            .height(500.dp)
            .width(500.dp)
            .background(Color.LightGray),
        horizontalArrangement = Arrangement.Start
    ) {

        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
        CustomItem(weight = 1f)

    }

}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {

    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}

}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewRow() {
    StevdzaComposeTheme {

        Row(
            modifier = Modifier.height(500.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)

        }

    }
}
package id.ackerman.stevdzacompose.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import id.ackerman.stevdzacompose.ui.theme.StevdzaComposeTheme

@Composable
fun SuperScriptText(
    normalText: String,
    superText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal
) {

    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(fontSize = normalFontSize)
        ) {

            append(normalText)

        }

        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.overline.fontSize,
                fontWeight = superTextFontWeight,
                baselineShift = BaselineShift.Subscript // klo mau sama rata di tgh, baris ini dihapus
            )
        ) {

            append(superText)

        }
    }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme() {
        Column(modifier = Modifier.fillMaxSize()) {

            SuperScriptText(
                normalText = "Hello",
                superText = "World!",
                superTextFontWeight = FontWeight.Light

            )

        }
    }
}
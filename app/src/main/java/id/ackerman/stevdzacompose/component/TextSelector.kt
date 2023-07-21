package id.ackerman.stevdzacompose.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.ackerman.stevdzacompose.ui.theme.StevdzaComposeTheme

@Composable
fun CustomTextSelector() {

    SelectionContainer {

        Column {

            Text(text = "Hello Kotlin Developer!")

            DisableSelection { Text(text = "Hello Android Developer") }

            Text(text = "Hello Spring Kotlin Developer")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewSelector() {
    StevdzaComposeTheme {

        CustomTextSelector()

    }
}
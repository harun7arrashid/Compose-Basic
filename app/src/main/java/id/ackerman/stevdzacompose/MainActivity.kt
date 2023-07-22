package id.ackerman.stevdzacompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ackerman.stevdzacompose.component.ExpandableCard
import id.ackerman.stevdzacompose.component.LearnRow
import id.ackerman.stevdzacompose.component.SuperScriptText
import id.ackerman.stevdzacompose.ui.theme.StevdzaComposeTheme
import id.ackerman.stevdzacompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {

                Surface(color = MaterialTheme.colors.background) {
                    Greeting()
                }

            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var text by remember { mutableStateOf("") }

        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "This is Title") },
            singleLine = true,
            placeholder = { Text(text = "This is Hint") },
            leadingIcon = {

                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            },

            trailingIcon = {

                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Cheklis Icon"
                    )
                }
            },

            keyboardOptions  = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction    = ImeAction.Search
            ),

            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("Harun", "Clicked onSearch")
                }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme {

        Greeting()

    }
}


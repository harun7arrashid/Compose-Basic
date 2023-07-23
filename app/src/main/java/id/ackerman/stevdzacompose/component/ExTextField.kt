package id.ackerman.stevdzacompose.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun ExTextField() {

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
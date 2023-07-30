package com.example.learningcompose.compose.converter

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.data.Conversion
import com.example.learningcompose.ui.theme.md_theme_dark_onTertiary

@Composable
fun InputBlock(
    conversion: Conversion,
    inputText: MutableState<String>,
    isLandScape: Boolean,
    modifier: Modifier = Modifier,
    context: Context = LocalContext.current,
    calculate: (String) -> Unit
){

    if (isLandScape) {
        Column(
            modifier = modifier.padding(top = 20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = inputText.value,
                    onValueChange = {
                        inputText.value = it
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        autoCorrect = true,
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.surface.copy(alpha = 0.5F)
                    ),
                    textStyle = TextStyle(color = Color.DarkGray, fontSize = 30.sp)
                )
                Spacer(modifier = modifier.padding(3.dp))
                Text(
                    text = conversion.convertFrom,
                    color = Color.Black,
                    fontSize = 24.sp
                )
            }

            Spacer(modifier = modifier.height(20.dp))
            OutlinedButton(
                onClick = {
                    if (inputText.value != "") calculate(inputText.value) else Toast.makeText(
                        context,
                        "Enter a value",
                        Toast.LENGTH_LONG
                    ).show()
                }
            ) {
                Text(
                    text = "Convert",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = md_theme_dark_onTertiary

                )

            }
        }
    }else{
        Column(
            modifier = modifier.padding(top = 20.dp)
        ) {
            Row(modifier = modifier
                .padding(horizontal = 2.dp)
                .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {
                TextField(
                    value = inputText.value,
                    onValueChange = {
                        inputText.value = it
                    },

                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        autoCorrect = true,
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.surface.copy(alpha = 0.5F)
                    ),
                    textStyle = TextStyle(color = Color.DarkGray, fontSize = 30.sp)
                )
                Text(
                    text = conversion.convertFrom,
                    fontSize = 24.sp,
                    color = md_theme_dark_onTertiary,
                    modifier = modifier
                        .padding(start = 10.dp, top = 30.dp)

                )
            }

            Spacer(modifier = modifier.height(20.dp))
            OutlinedButton(
                onClick = {
                    if (inputText.value != "") calculate(inputText.value) else Toast.makeText(
                        context,
                        "Enter a value",
                        Toast.LENGTH_LONG
                    ).show()
                },
                modifier = modifier.fillMaxWidth(1F)
            ) {
                Text(
                    text = "Convert",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = md_theme_dark_onTertiary

                )

            }
        }
    }
    
    
}
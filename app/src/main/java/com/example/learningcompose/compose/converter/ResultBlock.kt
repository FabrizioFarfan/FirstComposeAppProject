package com.example.learningcompose.compose.converter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.ui.theme.md_theme_dark_onTertiary

@Composable
fun ResultBlock(
    modifier: Modifier = Modifier,
    isLandScape: Boolean,
    message1: String,
    message2: String
){

    if (isLandScape){
        Card(
            elevation = 30.dp,
            modifier = modifier
                .padding(top = 20.dp)
        ) {
            Column(
                modifier = modifier.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = message1,
                    fontSize = 28.sp
                )
                Spacer(modifier = modifier.padding(5.dp))
                Text(
                    text = message2,
                    fontSize = 28.sp,
                    color = md_theme_dark_onTertiary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    } else{
        Card(
            elevation = 30.dp,
            modifier = modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        ) {
            Column(
                modifier = modifier.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = message1,
                    fontSize = 28.sp
                )
                Spacer(modifier = modifier.padding(5.dp))
                Text(
                    text = message2,
                    fontSize = 28.sp,
                    color = md_theme_dark_onTertiary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

}
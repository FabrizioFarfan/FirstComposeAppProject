package com.example.learningcompose.compose.history

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.ui.theme.md_theme_dark_onPrimary
import com.example.learningcompose.ui.theme.md_theme_dark_onTertiary
import com.example.learningcompose.ui.theme.md_theme_dark_primaryContainer

@Composable
fun HistoryItem(
    messagePart1: String,
    messagePart2: String,
    onClose: ()-> Unit,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .border(border = BorderStroke(2.dp, Color.LightGray))
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column {
            Text(
                color = md_theme_dark_onPrimary,
                fontWeight = FontWeight.Light,
                text = messagePart1,
                fontSize = 20.sp
                )
            Spacer(modifier = modifier.padding(3.dp))
            Text(
                text = messagePart2,
                color = md_theme_dark_onTertiary,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp
            )
        }
        IconButton(onClick = { onClose() }) {
            Icon(imageVector = Icons.Filled.Close, modifier = modifier.background(color = md_theme_dark_onTertiary), contentDescription = "close")
        }

    }

}
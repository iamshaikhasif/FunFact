package com.example.funfactthemesapplication.ui.widget

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun LargeNormalText(text: String){
    Text(
        text = text,
        color = Color.Black,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
}

@Composable
fun MediumNormalText(text: String){
    Text(
        text = text,
        color = Color.Black,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify
    )
}

@Composable
fun SmallNormalText(text: String){
    Text(
        text = text,
        color = Color.Black,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
}
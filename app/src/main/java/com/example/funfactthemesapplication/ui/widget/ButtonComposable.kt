package com.example.funfactthemesapplication.ui.widget

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CustomButtonComposable(modifier: Modifier, onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = modifier
    ) {
        Text("Submit", color = Color.White, fontSize = 18.sp)
    }
}
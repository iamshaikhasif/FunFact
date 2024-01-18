package com.example.funfactthemesapplication.ui.widget

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpaceHeightBoxComposable(size: Int){
    Box(modifier = Modifier.height(size.dp))
}
package com.example.funfactthemesapplication.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.funfactthemesapplication.R
import com.example.funfactthemesapplication.ui.theme.PlatinumGray
import com.example.funfactthemesapplication.ui.theme.Purple40
import com.example.funfactthemesapplication.ui.theme.PurpleGrey40

@Composable
fun AnimalCardComposable(img:Int, selected : Boolean, animalSelected: (animal:String) -> Unit){
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(PlatinumGray),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(24.dp)
            .size(130.dp)
            .clickable {
                val animalName = if(img == R.drawable.cat) "Cat" else "Dog"
                animalSelected(animalName)
            }
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = if(selected) PurpleGrey40 else Color.Transparent,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .padding(16.dp)
                    .wrapContentWidth()
                    .wrapContentHeight()
            )
        }
    }
}


/*
@Preview
@Composable
fun img() {
    AnimalCardComposable()
}*/

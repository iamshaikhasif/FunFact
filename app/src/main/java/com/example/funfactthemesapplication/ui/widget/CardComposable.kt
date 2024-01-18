package com.example.funfactthemesapplication.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.funfactthemesapplication.R
import com.example.funfactthemesapplication.ui.theme.PlatinumGray

@Composable
fun FunFactCard(fact: String) {

    Card(
        colors = CardDefaults.cardColors(PlatinumGray),
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.double_quotes),
                contentDescription = "double_quotes",
                modifier = Modifier.size(24.dp)
            )
            MediumNormalText(text = fact)
            Image(
                painter = painterResource(id = R.drawable.double_quotes),
                contentDescription = "double_quotes",
                modifier = Modifier.size(24.dp)
            )
        }
    }

}
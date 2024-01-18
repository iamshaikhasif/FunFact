package com.example.funfactthemesapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.funfactthemesapplication.ui.viewModel.UserInputViewModel
import com.example.funfactthemesapplication.ui.viewModel.WelcomeViewModel
import com.example.funfactthemesapplication.ui.widget.FunFactCard
import com.example.funfactthemesapplication.ui.widget.LargeNormalText
import com.example.funfactthemesapplication.ui.widget.SpaceHeightBoxComposable
import com.example.funfactthemesapplication.ui.widget.TopBarComposable

@Composable
fun WelcomeScreen(navController: NavController, userName:String, animalName: String){
    val viewModel = WelcomeViewModel()
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp)
        ) {
            TopBarComposable(text = "Welcome $userName")
            SpaceHeightBoxComposable(size = 30)
            LargeNormalText(text = "Let\'s learn about you!")
            SpaceHeightBoxComposable(size = 15)
            LargeNormalText(text = "You are a $animalName Lover.")
            SpaceHeightBoxComposable(size = 15)
            FunFactCard(fact = viewModel.getFacts(animalName))
        }
    }
}


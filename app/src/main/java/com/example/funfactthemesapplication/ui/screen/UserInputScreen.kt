package com.example.funfactthemesapplication.ui.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.funfactthemesapplication.ui.widget.LargeNormalText
import com.example.funfactthemesapplication.ui.widget.SmallNormalText
import com.example.funfactthemesapplication.ui.widget.SpaceHeightBoxComposable
import com.example.funfactthemesapplication.ui.widget.TopBarComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.funfactthemesapplication.R
import com.example.funfactthemesapplication.ui.data.UserInputEvent
import com.example.funfactthemesapplication.ui.viewModel.UserInputViewModel
import com.example.funfactthemesapplication.ui.widget.AnimalCardComposable
import com.example.funfactthemesapplication.ui.widget.CustomButtonComposable
import com.example.funfactthemesapplication.utils.Routers


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun UserInputScreen(navController: NavController, userInputViewModel: UserInputViewModel) {
    val controller = LocalSoftwareKeyboardController.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp)
        ) {
            TopBarComposable("Hi there")
            SpaceHeightBoxComposable(size = 30)
            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                LargeNormalText(text = "Let\'s learn about you!")
                SpaceHeightBoxComposable(size = 15)
                SmallNormalText(text = "This app will prepare a details page based on input provided by you!")
                SpaceHeightBoxComposable(size = 15)
                OutlinedTextField(
                    value = userInputViewModel.uiState.value.name,
                    onValueChange = {
                        userInputViewModel.onEvent(UserInputEvent.UserInputName(it))
                    },
                    textStyle = TextStyle(color = Color.Black,
                        fontSize = 16.sp,),
                    placeholder = {
                        Text(
                            text = "Your Name",
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    },
                    /*keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = {
                        localFocusManager.clearFocus()
                    },*/
                    modifier = Modifier.fillMaxWidth()
                )
                SpaceHeightBoxComposable(size = 35)
                SmallNormalText(text = "What do you like")
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                    ) {
                    AnimalCardComposable(img = R.drawable.cat, selected = userInputViewModel.uiState.value.animal == "Cat"){
                        controller?.hide()
                        userInputViewModel.onEvent(UserInputEvent.UserInputAnimal(it))
                    }
                    AnimalCardComposable(img = R.drawable.dog, selected = userInputViewModel.uiState.value.animal == "Dog"){
                        controller?.hide()
                        userInputViewModel.onEvent(UserInputEvent.UserInputAnimal(it))
                    }
                }
                
                Spacer(modifier = Modifier.weight(1f))

                if(userInputViewModel.showButton()){
                    val username = userInputViewModel.uiState.value.name
                    val animalName = userInputViewModel.uiState.value.animal
                    CustomButtonComposable(modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.End)) {
                        Log.d("Button", "CLicked...")
                        navController.navigate("${Routers.WELCOME_SCREEN}/${username}/${animalName}")
                    }
                }
            }
        }
    }
}
package com.example.funfactthemesapplication.ui.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.funfactthemesapplication.ui.data.UserInputData
import com.example.funfactthemesapplication.ui.data.UserInputEvent

class UserInputViewModel: ViewModel() {

    var uiState = mutableStateOf(UserInputData())

    fun onEvent(event: UserInputEvent){
        when(event){
            is UserInputEvent.UserInputName -> {
                uiState.value = uiState.value.copy(
                    name = event.name
                )
            }
            is UserInputEvent.UserInputAnimal -> {
                uiState.value = uiState.value.copy(
                    animal = event.animal
                )
            }
        }
    }

    fun showButton(): Boolean {
        if(!uiState.value.name.isNullOrEmpty() && !uiState.value.animal.isNullOrEmpty()){
            return true
        }

        return false
    }

}
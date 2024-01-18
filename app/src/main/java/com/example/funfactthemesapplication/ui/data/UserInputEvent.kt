package com.example.funfactthemesapplication.ui.data

sealed class UserInputEvent {
    data class UserInputName(val name:String) : UserInputEvent()
    data class UserInputAnimal(val animal:String) : UserInputEvent()
}
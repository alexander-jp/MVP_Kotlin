package com.mundet.mvp_kotlin.Main.Interfaces

open interface MainActivityInteractor {
    fun createUser(usuario: String, password: String)
}
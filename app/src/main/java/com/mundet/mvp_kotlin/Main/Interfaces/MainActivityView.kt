package com.mundet.mvp_kotlin.Main.Interfaces

open interface MainActivityView {
    fun getUsuario(): String

    fun getPasswors(): String

    fun showUserNotIvailable()

    fun showInputError()

    fun showUserSaved()

    fun setUsuario(usuario: String)

    fun setPassword(password: String)
}
package com.mundet.mvp_kotlin.Main.Interfaces

open interface MainActivityPresenter {
    fun setVista(vista: MainActivityView)

    fun loginButtonClickListener()

    fun getCurrentUser()
}
package com.mundet.mvp_kotlin.Login

open interface LoginActivityMPV {

    open interface View {
        fun getUsuario(): String

        fun getPasswors(): String

        fun showUserNotIvailable()

        fun showInputError()

        fun showUserSaved()

        fun setUsuario(usuario: String)

        fun setPassword(password: String)
    }

    open interface Model {
        fun createUser(usuario: String, password: String)
    }

    open interface Presenter {
        fun setVista(vista: LoginActivityMPV.View)

        fun loginButtonClickListener()

        fun getCurrentUser()
    }
}
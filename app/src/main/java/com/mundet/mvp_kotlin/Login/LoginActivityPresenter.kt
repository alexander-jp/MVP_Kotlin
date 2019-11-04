package com.mundet.mvp_kotlin.Login

import androidx.annotation.Nullable

open class LoginActivityPresenter constructor(model: LoginActivityMPV.Model) :
    LoginActivityMPV.Presenter {

    @Nullable
    var model: LoginActivityMPV.Model? = null
    @Nullable
    var view: LoginActivityMPV.View? = null

    init {
        this.model = model
    }

    override fun setVista(vista: LoginActivityMPV.View) {
        this.view = vista
    }

    override fun loginButtonClickListener() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
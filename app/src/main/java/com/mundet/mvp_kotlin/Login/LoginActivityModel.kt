package com.mundet.mvp_kotlin.Login

import androidx.annotation.Nullable

open class LoginActivityModel constructor(repository: LoginRepository) : LoginActivityMPV.Model {

    @Nullable
    var repository: LoginRepository? = null

    init {
        this.repository = repository
    }

    override fun createUser(usuario: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
package com.mundet.mvp_kotlin.Main.Interactors

import androidx.annotation.Nullable
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityInteractor
import com.mundet.mvp_kotlin.Main.Repositorys.MainRepository

open class MainActivityInteractorImpl constructor(repository: MainRepository) :
    MainActivityInteractor {

    @Nullable
    var repository: MainRepository? = null

    init {
        this.repository = repository
    }

    override fun createUser(usuario: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
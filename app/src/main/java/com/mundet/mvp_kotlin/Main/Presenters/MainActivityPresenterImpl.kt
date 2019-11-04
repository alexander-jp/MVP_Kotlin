package com.mundet.mvp_kotlin.Main.Presenters

import androidx.annotation.Nullable
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityInteractor
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityPresenter
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityView

open class MainActivityPresenterImpl constructor(model: MainActivityInteractor) :
    MainActivityPresenter {

    @Nullable
    var model: MainActivityInteractor? = null
    @Nullable
    var view: MainActivityView? = null

    init {
        this.model = model
    }

    override fun setVista(vista: MainActivityView) {
        this.view = vista
    }

    override fun loginButtonClickListener() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
package com.mundet.mvp_kotlin.Main.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityPresenter
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityView
import com.mundet.mvp_kotlin.R
import com.mundet.mvp_kotlin.root.App
import javax.inject.Inject

open class MainActivity : AppCompatActivity(),
    MainActivityView {

    @Inject
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //presenter.setVista(this)
        (application as App).component?.inject(this)

    }

    override fun onResume() {
        super.onResume()
        presenter.setVista(this)
    }

    override fun getUsuario(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPasswors(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUserNotIvailable() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showInputError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUserSaved() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setUsuario(usuario: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPassword(password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

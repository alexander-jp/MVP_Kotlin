package com.mundet.mvp_kotlin.Login

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mundet.mvp_kotlin.R
import com.mundet.mvp_kotlin.root.App
import javax.inject.Inject

open class LoginActivity : AppCompatActivity(), LoginActivityMPV.View {

    @Inject
    lateinit var presenter: LoginActivityMPV.Presenter

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

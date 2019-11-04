package com.mundet.mvp_kotlin.root

import android.app.Application
import com.mundet.mvp_kotlin.Login.LoginModule


class App : Application() {

    var component: ApplicationComponent? = null
        private set


    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .loginModule(LoginModule())
            .build()

    }
}
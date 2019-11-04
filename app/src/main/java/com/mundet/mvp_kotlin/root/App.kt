package com.mundet.mvp_kotlin.root

import android.app.Application
import com.mundet.mvp_kotlin.Main.Module.MainModule


class App : Application() {

    var component: ApplicationComponent? = null
        private set


    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .mainModule(MainModule())
            .build()

    }
}
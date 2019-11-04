package com.mundet.mvp_kotlin.root

import javax.inject.Singleton
import dagger.Provides
import android.app.Application
import android.content.Context
import dagger.Module


@Module
class ApplicationModule(private val aplication: Application) {

    @Provides
    @Singleton
    fun provideContent(): Context {
        return aplication
    }
}

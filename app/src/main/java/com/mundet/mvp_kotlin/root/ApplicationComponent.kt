package com.mundet.mvp_kotlin.root

import androidx.annotation.Nullable
import com.mundet.mvp_kotlin.Login.LoginModule
import com.mundet.mvp_kotlin.Login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, LoginModule::class))
interface ApplicationComponent {
    fun inject(@Nullable target: LoginActivity)
}
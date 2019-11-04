package com.mundet.mvp_kotlin.root

import androidx.annotation.Nullable
import com.mundet.mvp_kotlin.Main.Module.MainModule
import com.mundet.mvp_kotlin.Main.Views.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, MainModule::class))
interface ApplicationComponent {
    fun inject(@Nullable target: MainActivity)
}
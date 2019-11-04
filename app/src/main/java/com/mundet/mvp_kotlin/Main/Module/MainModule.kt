package com.mundet.mvp_kotlin.Main.Module

import com.mundet.mvp_kotlin.Main.Interactors.MainActivityInteractorImpl
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityInteractor
import com.mundet.mvp_kotlin.Main.Interfaces.MainActivityPresenter
import com.mundet.mvp_kotlin.Main.Repositorys.MainRepository
import com.mundet.mvp_kotlin.Main.Presenters.MainActivityPresenterImpl
import com.mundet.mvp_kotlin.Main.Repositorys.MemoryRepository
import dagger.Module
import dagger.Provides


@Module
class MainModule {

    @Provides
    fun provideMainActivityPresenter(model: MainActivityInteractor): MainActivityPresenter {
        return MainActivityPresenterImpl(model)
    }

    @Provides
    fun provideMainActivityModel(repository: MainRepository): MainActivityInteractor {
        return MainActivityInteractorImpl(repository)
    }

    @Provides
    fun provideMainRepository(): MainRepository {
        return MemoryRepository()
    }
}
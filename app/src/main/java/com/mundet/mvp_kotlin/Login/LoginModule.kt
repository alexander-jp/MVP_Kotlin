package com.mundet.mvp_kotlin.Login

import dagger.Module
import dagger.Provides


@Module
class LoginModule {

    @Provides
    fun provideLoginActivityPresenter(model: LoginActivityMPV.Model): LoginActivityMPV.Presenter {
        return LoginActivityPresenter(model)
    }

    @Provides
    fun provideLoginActivityModel(repository: LoginRepository): LoginActivityMPV.Model {
        return LoginActivityModel(repository)
    }

    @Provides
    fun provideLoginRepository(): LoginRepository {
        return MemoryRepository()
    }
}
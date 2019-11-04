package com.mundet.mvp_kotlin.Login

import android.graphics.Movie


interface LoginRepository {

    val movie: Movie

    fun savedMovie(usuario: String, password: String)
}

package com.mundet.mvp_kotlin.Main.Repositorys

import android.graphics.Movie


interface MainRepository {

    val movie: Movie

    fun savedMovie(usuario: String, password: String)
}

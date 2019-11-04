package com.mundet.mvp_kotlin.Login

import android.graphics.Movie


class MemoryRepository : LoginRepository {

    private var user: Movie? = null

    override val movie: Movie
        get() {

            return null!!
        }

    override fun savedMovie(usuario: String, password: String) {
        if (user == null) {
            user = movie
        }
        this.user = user
    }
}

package com.cristianvillamil.platziwallet.ui.home.data

class User private constructor(private val name: String, private val password: String) {

    class Builder {
        var name: String = ""
        var password: String? = null

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setPassword(password: String): Builder {
            this.password = password
            return this
        }

        fun buil():User {
            return User(name, password ?: "")
        }
    }

}
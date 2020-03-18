package com.cristianvillamil.platziwallet

class UserSingleton {

    val userName = "Cristhian"

    companion object {
        private var INSTANCE : UserSingleton? = null

        fun getInstance() : UserSingleton {
            if(INSTANCE == null)
                INSTANCE = UserSingleton()

            return INSTANCE as UserSingleton
        }
    }

}
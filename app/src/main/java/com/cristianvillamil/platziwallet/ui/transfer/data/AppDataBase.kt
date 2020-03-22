package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TransferEntity::class], version = 1)
abstract class AppDataBase: RoomDatabase() {

    abstract fun getDao(): TransfersDao

    companion object {
        private var INSTANCE: AppDataBase? = null

        fun getAppDataBase(context: Context): AppDataBase? {
            if(INSTANCE == null)
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "platziWalletDataBase"
                ).allowMainThreadQueries().build()

            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}
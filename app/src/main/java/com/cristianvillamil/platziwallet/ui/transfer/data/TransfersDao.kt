package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransfersDao {

    @Query("SELECT * FROM transfers")
    fun getAll(): List<TransferEntity>

    @Query("SELECT * FROM transfers WHERE user_name LIKE :userName")
    fun findTransfersByUserName(userName: String): List<TransferEntity>

    @Insert
    fun saveTransfer(transfer: TransferEntity)

    @Delete
    fun deleteTransfer(transfer: TransferEntity)
}
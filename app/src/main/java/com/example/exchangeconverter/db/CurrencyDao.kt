package com.example.exchangeconverter.db

import androidx.room.*

@Dao
interface CurrencyDao {
    @Query("SELECT * From currency_items")
    suspend fun getAll(): List<CurrencyEntity>

    @Query("Select * From currency_items WHERE id = :id")
    suspend fun getId(id: Int): CurrencyEntity

    @Query("Select * From currency_items WHERE unicode = :unicode")
    suspend fun getUNICODE(unicode: String): CurrencyEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(currencyEntityList: List<CurrencyEntity>)

    @Delete
    suspend fun delete(currencyEntity: CurrencyEntity)

    @Update
    suspend fun updateAll(vararg currencyEntity: CurrencyEntity)
}
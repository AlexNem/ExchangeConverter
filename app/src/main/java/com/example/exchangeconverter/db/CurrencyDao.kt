package com.example.exchangeconverter.db

import androidx.room.*

@Dao
interface CurrencyDao {
    @Query("SELECT * From currency_items")
    fun getAll(): List<DBCurrency>

//    @Query("Select * From currency_items WHERE unicode LIKE unicode")
//    fun getUnicode(unicode: String): DBCurrency

    @Insert
    fun insertAll(vararg currency: DBCurrency)

    @Delete
    fun delete(currency: DBCurrency)

    @Update
    fun updateAll(vararg currency: DBCurrency)
}
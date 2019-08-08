package com.example.exchangeconverter.db

import androidx.room.Database
import androidx.room.RoomDatabase

    @Database(entities = arrayOf(CurrencyEntity::class), version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
}
package com.example.exchangeconverter.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Currency_items")
class DBCurrency (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "unicode") var unicode: String,
    @ColumnInfo(name = "buy_price") var buy_price: Double,
    @ColumnInfo(name = "sell_price") var sell_price: Double,
    @ColumnInfo(name = "coefficient_UAH") var coefficient_UAH: Double

)
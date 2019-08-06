package com.example.exchangeconverter.db

class CurrencyModel(
        val id: Int,
        val name: String,
        val unicode: String,
        val buy_price: Double,
        val sell_price: Double,
        val coefficient_UAH: Double ){
}
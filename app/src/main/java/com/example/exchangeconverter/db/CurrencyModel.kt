package com.example.exchangeconverter.db

class CurrencyModel(
        val id: Int,
        val name: String,
        val unicode: String,
        val currency_buy_price: Double,
        val currency_sell_price: Double,
        val coefficient_UAH: Double ){
}
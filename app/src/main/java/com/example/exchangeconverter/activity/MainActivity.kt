package com.example.exchangeconverter.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.exchangeconverter.R
import com.example.exchangeconverter.fragment.first.MyFirstRecycler
import com.example.exchangeconverter.fragment.second.MySecondRecycler
import kotlinx.android.synthetic.main.fragment_all_currency.*
import kotlinx.android.synthetic.main.fragment_currency.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFirstRecycler()
        setSecondRecycler()
    }

    private fun setFirstRecycler(){
        currency_recycler.layoutManager = LinearLayoutManager(this)
        currency_recycler.adapter = MyFirstRecycler(Data())
    }

    private fun setSecondRecycler(){
        all_currency_recycler.layoutManager = LinearLayoutManager(this)
        all_currency_recycler.adapter = MySecondRecycler(Data())
    }

    private fun Data():MutableList<String>{
        val currency_mock = mutableListOf<String>()
        currency_mock.add(0, "EUR")
        currency_mock.add(1, "USD")
        currency_mock.add(2, "PLN")
        return currency_mock
    }

}

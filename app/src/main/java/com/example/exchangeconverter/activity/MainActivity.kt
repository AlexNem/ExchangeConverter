package com.example.exchangeconverter.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.exchangeconverter.R
import com.example.exchangeconverter.fragment.MyItemRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_currency.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecycler()
    }

    fun setRecycler(){
        currency_recycler.layoutManager = LinearLayoutManager(this)
        currency_recycler.adapter = MyItemRecyclerViewAdapter(Data())
    }

    fun Data():MutableList<String>{
        val currency_mock = mutableListOf<String>()
        currency_mock.add(0, "EUR")
        currency_mock.add(1, "USD")
        currency_mock.add(2, "PLN")
        return currency_mock
    }

}

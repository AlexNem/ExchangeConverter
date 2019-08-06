package com.example.exchangeconverter.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exchangeconverter.R
import com.example.exchangeconverter.ui.fragment.first.MyFirstRecycler
import com.example.exchangeconverter.ui.fragment.second.MySecondRecycler
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

//    val db = Room.databaseBuilder(
//        applicationContext,
//        AppDB::class.java, "currency_list.db"
//        ).build()

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

package com.example.exchangeconverter.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exchangeconverter.R
import com.example.exchangeconverter.db.MockCurrencyData
import com.example.exchangeconverter.ui.fragment.first.MyFirstRecycler
import com.example.exchangeconverter.ui.fragment.second.MySecondRecycler
import kotlinx.android.synthetic.main.fragment_all_currency.*
import kotlinx.android.synthetic.main.fragment_currency.*

class MainActivity : AppCompatActivity()
{
    var mockData = MockCurrencyData()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        setFirstRecycler()
        setSecondRecycler()
    }

//    fun getDB(): List<CurrencyEntity>{
//        var db = Room.databaseBuilder(applicationContext, AppDB::class.java, "currencydb")
//            .build()
//        var data = listOf<CurrencyEntity>()
//        Thread{
//            db.currencyDao().insertAll(mockData.Data())
//            data = db.currencyDao().getAll()
//        }.start()
//        return data
//    }

    private fun setFirstRecycler(){
        currency_recycler.layoutManager = LinearLayoutManager(this)
        currency_recycler.adapter = MyFirstRecycler(mockData.DataFirst())
    }

    private fun setSecondRecycler(){
        all_currency_recycler.layoutManager = LinearLayoutManager(this)
        all_currency_recycler.adapter = MySecondRecycler(mockData.Data())
    }


}

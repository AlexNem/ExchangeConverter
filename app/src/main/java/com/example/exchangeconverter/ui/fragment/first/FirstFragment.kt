package com.example.exchangeconverter.ui.fragment.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.exchangeconverter.R
import com.example.exchangeconverter.db.CurrencyEntity


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_currency, container, false)
        return view
    }

    private fun Data():MutableList<CurrencyEntity>{
        var USD = CurrencyEntity(
                1, "Доллар США", "USD", 25.500, 28.800, 25.730 )
        var EUR = CurrencyEntity(
                2, "Євро", "EUR", 28.440, 28.900, 28.600 )
        var RUR = CurrencyEntity(
                3, "Російський Рубль", "RUR", 0.370, 0.410, 0.3900 )

        val currencyMockList = mutableListOf<CurrencyEntity>()
        currencyMockList.add(USD)
        currencyMockList.add(EUR)
        currencyMockList.add(RUR)
        return currencyMockList
    }
}

package com.example.exchangeconverter.ui.fragment.second

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeconverter.R
import com.example.exchangeconverter.db.CurrencyEntity
import com.example.exchangeconverter.ui.fragment.first.FirstFragment
import com.example.exchangeconverter.ui.fragment.first.MyFirstRecycler

class SecondFragment : Fragment(){

    private var columnCount = 1

    private var listener: OnListFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_currency, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyFirstRecycler(
                        Data()
                )
            }
        }
        return view
    }

    private fun Data():MutableList<CurrencyEntity>{
        var USD = CurrencyEntity(
                1, "Доллар США", "USD", 25.500, 28.800, 25.730 )
        var EUR = CurrencyEntity(
                2, "Євро", "EUR", 28.440, 28.900, 28.600 )
        var RUR = CurrencyEntity(
                3, "Російський Рубль", "RUR", 0.370, 0.410, 0.3900 )
        var GBP = CurrencyEntity(
                3, "Фунт Стерлінгів", "GBP", 0.370, 0.410, 0.390)
        var CHF = CurrencyEntity(
                3, "Швейцарський Франк", "CHF", 25.295, 26.540, 25.930 )
        var SEK = CurrencyEntity(
                3, "Шведська Крона", "SEK", 0.370, 0.410, 2.674)
        var PLN = CurrencyEntity(
                3, "Польський Злотий", "PLN", 0.370, 0.410, 6.670)
        var NOK = CurrencyEntity(
                3, "Норвезька Крона", "NOK", 0.370, 0.410, 0.390)
        var JPY = CurrencyEntity(
                3, "Японська Ієна", "JPY", 0.370, 0.410, 0.240)
        var DKK = CurrencyEntity(
                3, "Датська крона", "DKK", 0.370, 0.410, 3.850)
        var CAD = CurrencyEntity(
                3, "Канадський Доллар", "CAD", 0.370, 0.410, 19.470)
        var BYN = CurrencyEntity(
                3, "Білоруський Рубль", "BYN", 0.370, 0.410, 12.515)
        var CZK = CurrencyEntity(
                3, "Чеська Крона", "CZK", 0.370, 0.410, 1.110)
        var ILS = CurrencyEntity(
                3, "Ізраільський Шекель", "ILS", 0.370, 0.410, 7.370)

        val currencyMockList = mutableListOf<CurrencyEntity>()
        currencyMockList.add(USD)
        currencyMockList.add(EUR)
        currencyMockList.add(RUR)
        currencyMockList.add(GBP)
        currencyMockList.add(CHF)
        currencyMockList.add(SEK)
        currencyMockList.add(PLN)
        currencyMockList.add(NOK)
        currencyMockList.add(JPY)
        currencyMockList.add(DKK)
        currencyMockList.add(CAD)
        currencyMockList.add(BYN)
        currencyMockList.add(CZK)
        currencyMockList.add(ILS)
        return currencyMockList
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnListFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: String?)
    }

    companion object {

        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) =
                FirstFragment().apply {
                    arguments = Bundle().apply {
                        putInt(ARG_COLUMN_COUNT, columnCount)
                    }
                }
    }
}
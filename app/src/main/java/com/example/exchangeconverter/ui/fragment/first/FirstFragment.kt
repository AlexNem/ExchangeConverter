package com.example.exchangeconverter.ui.fragment.first

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


class FirstFragment : Fragment() {

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
        val view = inflater.inflate(R.layout.fragment_currency, container, false)

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

        val currencyMockList = mutableListOf<CurrencyEntity>()
        currencyMockList.add(USD)
        currencyMockList.add(EUR)
        currencyMockList.add(RUR)
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

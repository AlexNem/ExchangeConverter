package com.example.exchangeconverter.ui.fragment.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeconverter.R
import com.example.exchangeconverter.db.CurrencyEntity
import kotlinx.android.synthetic.main.fragment_item_all.view.*

class MySecondRecycler(private val mValues: List<CurrencyEntity>)
    : RecyclerView.Adapter<MySecondRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_item_all, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.tv_currence.text = item.name
        holder.tv_currence_price.text = item.unicode
        holder.tv_currence_val.text = item.coefficient_UAH.toString()


    }

    override fun getItemCount(): Int = mValues.size


    inner class ViewHolder(val mView: View): RecyclerView.ViewHolder(mView){
        val tv_currence: TextView = mView.tv_currency
        val tv_currence_val: TextView = mView.tv_currency_val
        val tv_currence_price: TextView = mView.tv_currency_price
    }
}
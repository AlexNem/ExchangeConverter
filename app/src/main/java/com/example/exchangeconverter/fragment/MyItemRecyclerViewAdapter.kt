package com.example.exchangeconverter.fragment


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.exchangeconverter.R
import kotlinx.android.synthetic.main.fragment_item.view.*

class MyItemRecyclerViewAdapter(
        private val mValues: List<String>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.tv_Current.text = item
        holder.tv_sell.text = item

    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val tv_Current: TextView = mView.tv_current_1
        val tv_buy: TextView = mView.tv_buy_1
        val tv_sell: TextView = mView.tv_sell_1

        override fun toString(): kotlin.String {
            return super.toString() + " '" + tv_sell.text + "'"
        }
    }
}

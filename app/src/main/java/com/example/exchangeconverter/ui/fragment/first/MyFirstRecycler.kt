package com.example.exchangeconverter.ui.fragment.first



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeconverter.R
import com.example.exchangeconverter.db.CurrencyEntity
import kotlinx.android.synthetic.main.fragment_item.view.*

class MyFirstRecycler(
        private val mValues: List<CurrencyEntity>
) : RecyclerView.Adapter<MyFirstRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.tv_Currence.text = item.unicode
        holder.tv_buy.text = item.buy_price.toString()
        holder.tv_sell.text = item.sell_price.toString()


    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val tv_Currence: TextView = mView.tv_currency
        val tv_buy: TextView = mView.tv_currency_val
        val tv_sell: TextView = mView.tv_currency_price
    }
}

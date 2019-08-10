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
    var mValues: List<CurrencyEntity>,
    val callback: CallBack
) : RecyclerView.Adapter<MyFirstRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder  =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.onBinds(item)
    }

    override fun getItemCount() = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView){

        val tv_Currence: TextView = mView.tv_currency
        val tv_buy: TextView = mView.tv_currency_val
        val tv_sell: TextView = mView.tv_currency_price

        fun onBinds(item: CurrencyEntity){
            tv_Currence.text = item.unicode
            tv_buy.text = item.buy_price.toString()
            tv_sell.text = item.sell_price.toString()
            mView.setOnClickListener{
                if (adapterPosition != RecyclerView.NO_POSITION) callback.onCurrencyClick(mValues[adapterPosition])
            }
        }

    }
    interface CallBack{
        fun onCurrencyClick(item: CurrencyEntity)
    }

}

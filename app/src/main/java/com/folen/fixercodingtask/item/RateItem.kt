package com.folen.fixercodingtask.item

import android.view.View
import androidx.core.content.ContextCompat
import com.folen.fixercodingtask.R
import com.folen.fixercodingtask.databinding.ItemRatesBinding
import com.folen.fixercodingtask.utilities.Currencies
import com.folen.fixercodingtask.utilities.CurrencyUtils
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

class RateItem(
    val code: String,
    val value: Double,
    val date: String
) : AbstractItem<RateItem.ViewHolder>() {

    override val type = R.id.item_rates

    override val layoutRes = R.layout.item_rates

    override fun getViewHolder(v: View) = ViewHolder(v)

    class ViewHolder(view: View) : FastAdapter.ViewHolder<RateItem>(view) {

        private val binding = ItemRatesBinding.bind(view)

        override fun bindView(item: RateItem, payloads: List<Any>) {
            binding.apply {
                rateCode.text = item.code
                rateValue.text = CurrencyUtils.roundNumberToTwoPlaces(item.value)
                rateFlag.setImageDrawable(
                    ContextCompat.getDrawable(itemView.context, Currencies.getImage(item.code))
                )
                rateName.text = itemView.context.getString(Currencies.getCurrencyName(item.code))
            }
        }

        override fun unbindView(item: RateItem) {
            binding.apply {
                rateCode.text = null
                rateValue.text = null
                rateName.text = null
                rateFlag.setImageDrawable(null)
            }
        }
    }
}
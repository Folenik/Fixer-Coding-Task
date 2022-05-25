package com.folen.fixercodingtask.item

import android.view.View
import com.folen.fixercodingtask.R
import com.folen.fixercodingtask.databinding.ItemHeaderBinding
import com.folen.fixercodingtask.utilities.CalendarUtils
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

class HeaderItem(val date: String) : AbstractItem<HeaderItem.ViewHolder>() {

    override val type = R.id.item_header

    override val layoutRes = R.layout.item_header

    override fun getViewHolder(v: View) = ViewHolder(v)

    class ViewHolder(view: View) : FastAdapter.ViewHolder<HeaderItem>(view) {

        private val binding = ItemHeaderBinding.bind(view)

        override fun bindView(item: HeaderItem, payloads: List<Any>) {
            binding.headerText.text = CalendarUtils.mapDate(item.date)
        }

        override fun unbindView(item: HeaderItem) {
            binding.headerText.text = null
        }
    }
}
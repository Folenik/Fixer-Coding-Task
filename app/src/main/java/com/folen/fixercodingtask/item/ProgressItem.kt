package com.folen.fixercodingtask.item

import android.view.View
import com.folen.fixercodingtask.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

class ProgressItem : AbstractItem<ProgressItem.ViewHolder>() {

    override val type = R.id.item_progress

    override val layoutRes = R.layout.item_progress

    override fun getViewHolder(v: View) = ViewHolder(v)

    class ViewHolder(view: View) : FastAdapter.ViewHolder<ProgressItem>(view) {

        override fun bindView(item: ProgressItem, payloads: List<Any>) = Unit

        override fun unbindView(item: ProgressItem) = Unit
    }
}
package com.folen.fixercodingtask.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.folen.fixercodingtask.R
import com.folen.fixercodingtask.databinding.ActivityRatesBinding
import com.folen.fixercodingtask.item.HeaderItem
import com.folen.fixercodingtask.item.ProgressItem
import com.folen.fixercodingtask.item.RateItem
import com.folen.fixercodingtask.utilities.CalendarUtils
import com.folen.fixercodingtask.utilities.Constants.CODE_MESSAGE
import com.folen.fixercodingtask.utilities.Constants.DATE_MESSAGE
import com.folen.fixercodingtask.utilities.Constants.VALUE_MESSAGE
import com.folen.fixercodingtask.viewmodel.RatesViewModel
import com.folen.fixercodingtask.viewmodel.RatesViewModelEvent
import com.google.android.material.snackbar.Snackbar
import com.google.gson.internal.LinkedTreeMap
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.GenericItemAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter.Companion.items
import com.mikepenz.fastadapter.listeners.addClickListener
import com.mikepenz.fastadapter.scroll.EndlessRecyclerOnScrollListener
import org.koin.androidx.viewmodel.ext.android.viewModel

class RatesActivity : AppCompatActivity() {

    private val viewModel: RatesViewModel by viewModel()
    private lateinit var binding: ActivityRatesBinding
    private val itemAdapter = GenericItemAdapter()
    private val footerAdapter: ItemAdapter<ProgressItem> = items()
    private val fastAdapter = FastAdapter.with(listOf(itemAdapter, footerAdapter))
    private var nextEndDate: String = CalendarUtils.today()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rates)
        setupList()
        viewModel.ratesSubject.subscribe(::handleEvent)
        viewModel.getRates(nextEndDate)
    }

    private fun openActivity(code: String, value: Double, date: String) {
        val intent = Intent(this, RateDetailsActivity::class.java).apply {
            putExtra(CODE_MESSAGE, code)
            putExtra(VALUE_MESSAGE, value.toString())
            putExtra(DATE_MESSAGE, date)
        }
        startActivity(intent)
    }

    private fun setupList() {
        binding.list.apply {
            adapter = fastAdapter
            layoutManager = LinearLayoutManager(context)
            addOnScrollListener(object : EndlessRecyclerOnScrollListener(footerAdapter) {
                override fun onLoadMore(currentPage: Int) {
                    footerAdapter.clear()
                    footerAdapter.add(ProgressItem())
                    viewModel.getRates(nextEndDate)
                }
            })
            adapter?.apply {
                stateRestorationPolicy =
                    RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            }
        }

        fastAdapter.addClickListener({ vh: RateItem.ViewHolder -> vh.itemView }) { _, _, _, item ->
            when (item) {
                is RateItem -> openActivity(item.code, item.value, item.date)
            }
        }
    }

    private fun addItems(rates: LinkedTreeMap<String, LinkedTreeMap<String, Double>>) {
        rates.toSortedMap(reverseOrder()).forEach {
            itemAdapter.add(HeaderItem(it.key))
            it.value.forEach { rate ->
                itemAdapter.add(RateItem(rate.key, rate.value, it.key))
            }
        }
    }

    private fun handleEvent(event: RatesViewModelEvent) {
        footerAdapter.clear()
        when (event.type) {
            RatesViewModelEvent.Type.LOADING -> {
                footerAdapter.add(ProgressItem())
            }
            RatesViewModelEvent.Type.DATA_LOADED -> {
                footerAdapter.clear()
                addItems(event.rates)
                nextEndDate = event.nextEndDate
            }
            RatesViewModelEvent.Type.ERROR -> {
                footerAdapter.clear()
                Snackbar.make(binding.root, event.error.message.toString(), Snackbar.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
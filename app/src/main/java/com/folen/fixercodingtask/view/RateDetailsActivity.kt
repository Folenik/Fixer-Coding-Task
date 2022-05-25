package com.folen.fixercodingtask.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.folen.fixercodingtask.R
import com.folen.fixercodingtask.databinding.ActivityRateDetailsBinding
import com.folen.fixercodingtask.utilities.CalendarUtils
import com.folen.fixercodingtask.utilities.Constants.CODE_MESSAGE
import com.folen.fixercodingtask.utilities.Constants.DATE_MESSAGE
import com.folen.fixercodingtask.utilities.Constants.VALUE_MESSAGE
import com.folen.fixercodingtask.utilities.Currencies
import com.folen.fixercodingtask.utilities.CurrencyUtils

class RateDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRateDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rate_details)
        setupCurrencyInfo()
    }

    private fun setupCurrencyInfo() {
        intent.getStringExtra(CODE_MESSAGE)?.let { code ->
            binding.also {
                it.rateCode.text = code
                it.rateName.text = getString(Currencies.getCurrencyName(code))
                it.rateValue.text = intent.getStringExtra(VALUE_MESSAGE)?.let { value ->
                    CurrencyUtils.roundNumberToTwoPlaces(value.toDouble())
                }
                it.headerText.text = intent.getStringExtra(DATE_MESSAGE)?.let { date ->
                    CalendarUtils.mapDate(date)
                }
                it.rateFlag.setImageDrawable(
                    ContextCompat.getDrawable(this, Currencies.getImage(code))
                )
            }
        }
    }
}

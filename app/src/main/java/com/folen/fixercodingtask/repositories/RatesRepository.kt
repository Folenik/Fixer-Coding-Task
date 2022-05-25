package com.folen.fixercodingtask.repositories

import com.folen.fixercodingtask.api.APIService
import com.folen.fixercodingtask.model.Rates
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class RatesRepository(private val apiService: APIService) {

    fun getRates(startDate: String, endDate: String): Single<Rates> {
        return apiService.getRates(startDate, endDate)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}
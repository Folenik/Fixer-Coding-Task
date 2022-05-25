package com.folen.fixercodingtask.viewmodel

import androidx.lifecycle.ViewModel
import com.folen.fixercodingtask.repositories.RatesRepository
import com.folen.fixercodingtask.utilities.CalendarUtils
import com.folen.fixercodingtask.utilities.Constants.PAGE_SIZE
import com.google.gson.internal.LinkedTreeMap
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.subjects.PublishSubject

class RatesViewModel(private val ratesRepository: RatesRepository) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    val ratesSubject: PublishSubject<RatesViewModelEvent> = PublishSubject.create()

    fun getRates(endDate: String = CalendarUtils.today()) {
        ratesRepository.getRates(
            startDate = CalendarUtils.daysBefore(PAGE_SIZE, endDate),
            endDate = endDate
        )
            .doOnSubscribe {
                ratesSubject.onNext(RatesViewModelEvent(
                    type = RatesViewModelEvent.Type.LOADING
                ))
            }
            .subscribe({
            ratesSubject.onNext(
                RatesViewModelEvent(
                    type = RatesViewModelEvent.Type.DATA_LOADED,
                    rates = it.rates,
                    nextEndDate = CalendarUtils.daysBefore(PAGE_SIZE + 1, endDate)
                )
            )
        }, {
            ratesSubject.onNext(
                RatesViewModelEvent(
                    type = RatesViewModelEvent.Type.ERROR,
                    error = it
                )
            )
        })
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}

data class RatesViewModelEvent(
    val rates: LinkedTreeMap<String, LinkedTreeMap<String, Double>> = LinkedTreeMap<String, LinkedTreeMap<String, Double>>(),
    val nextEndDate: String = CalendarUtils.today(),
    val type: Type,
    val error: Throwable = Throwable()
) {
    enum class Type {
        LOADING, DATA_LOADED, ERROR
    }
}
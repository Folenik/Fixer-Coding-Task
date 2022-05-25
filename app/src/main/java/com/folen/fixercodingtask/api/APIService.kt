package com.folen.fixercodingtask.api

import com.folen.fixercodingtask.model.Rates
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("timeseries")
    fun getRates(
        @Query("start_date") startDate: String,
        @Query("end_date") endDate: String
    ): Single<Rates>
}
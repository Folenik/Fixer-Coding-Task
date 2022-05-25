package com.folen.fixercodingtask.model

import com.google.gson.annotations.SerializedName
import com.google.gson.internal.LinkedTreeMap

data class Rates(
    val base: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("end_date")
    val endDate: String,
    val rates: LinkedTreeMap<String, LinkedTreeMap<String, Double>>,
    val success: Boolean,
    val timeseries: Boolean
)
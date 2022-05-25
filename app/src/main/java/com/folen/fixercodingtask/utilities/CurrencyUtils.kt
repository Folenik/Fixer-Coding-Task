package com.folen.fixercodingtask.utilities

object CurrencyUtils {
    fun roundNumberToTwoPlaces(number: Double): String {
        return "%.2f".format(number)
    }
}
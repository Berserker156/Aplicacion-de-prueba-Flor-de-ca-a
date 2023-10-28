package com.sis.aplicacion_conversor.repositorie;

import androidx.lifecycle.LiveData;

public interface CurrencyRepository {
    LiveData<Double> getConversionRate(String fromCurrency, String toCurrency);
}
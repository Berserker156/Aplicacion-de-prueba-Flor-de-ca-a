package com.sis.aplicacion_conversor.repositorie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class CurrencyRepositoryImpl implements CurrencyRepository {
    private MutableLiveData<Double> conversionRate;

    public CurrencyRepositoryImpl() {
        conversionRate = new MutableLiveData<>();
        conversionRate.setValue(1.0);
    }

    @Override
    public LiveData<Double> getConversionRate(String fromCurrency, String toCurrency) {
        return conversionRate;
    }
}

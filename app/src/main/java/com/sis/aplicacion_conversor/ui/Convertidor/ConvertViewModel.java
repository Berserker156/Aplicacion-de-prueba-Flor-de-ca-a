package com.sis.aplicacion_conversor.ui.Convertidor;

import com.sis.aplicacion_conversor.repositorie.CurrencyRepository;
import com.sis.aplicacion_conversor.repositorie.CurrencyRepositoryImpl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConvertViewModel extends ViewModel {
    private CurrencyRepository currencyRepository;

    public ConvertViewModel() {
        currencyRepository = new CurrencyRepositoryImpl();
    }

    public LiveData<Double> getConversionRate(String fromCurrency, String toCurrency) {
        return currencyRepository.getConversionRate(fromCurrency, toCurrency);
    }
}

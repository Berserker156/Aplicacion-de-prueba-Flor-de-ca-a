package com.sis.aplicacion_conversor.ui.Convertidor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.sis.aplicacion_conversor.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sis.aplicacion_conversor.databinding.FragmentConvertidorBinding;
import com.sis.aplicacion_conversor.viewModel.ConvertViewModel;

public class ConvertFragment extends Fragment {

    private FragmentConvertidorBinding binding;
    private ConvertViewModel convertViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentConvertidorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        convertViewModel = new ViewModelProvider(this).get(ConvertViewModel.class);

        // Vincula elementos de la vista
        Spinner fromCurrencySpinner = binding.fromCurrencySpinner;
        Spinner toCurrencySpinner = binding.fromCurrencySpinner;

        // Configura adaptadores para los Spinner (Euro, Dólar, Córdoba)
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.currencies,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromCurrencySpinner.setAdapter(adapter);
        toCurrencySpinner.setAdapter(adapter);


        binding.convertButton.setOnClickListener(view -> {
            String fromCurrency = fromCurrencySpinner.getSelectedItem().toString();
            String toCurrency = toCurrencySpinner.getSelectedItem().toString();

            convertViewModel.getConversionRate(fromCurrency, toCurrency).observe(getViewLifecycleOwner(), conversionRate -> {
                double amount = Double.parseDouble(binding.amountEditText.getText().toString());
                double convertedAmount = amount * conversionRate;
                binding.resultTextView.setText(String.valueOf(convertedAmount));
            });
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

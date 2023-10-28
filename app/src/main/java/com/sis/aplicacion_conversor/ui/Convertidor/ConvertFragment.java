package com.sis.aplicacion_conversor.ui.Convertidor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sis.aplicacion_conversor.databinding.FragmentConvertidorBinding;

public class ConvertFragment extends Fragment {

    private FragmentConvertidorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ConvertViewModel homeViewModel =
                new ViewModelProvider(this).get(ConvertViewModel.class);

        binding = FragmentConvertidorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
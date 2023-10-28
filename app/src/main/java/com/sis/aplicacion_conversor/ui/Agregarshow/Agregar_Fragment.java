package com.sis.aplicacion_conversor.ui.Agregarshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sis.aplicacion_conversor.databinding.FragmentIngresoBinding;

public class Agregar_Fragment extends Fragment {

    private FragmentIngresoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AgregarViewModel agregarViewModel =
                new ViewModelProvider(this).get(AgregarViewModel.class);

        binding = FragmentIngresoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        agregarViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
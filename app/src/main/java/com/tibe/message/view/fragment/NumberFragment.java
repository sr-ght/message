package com.tibe.message.view.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tibe.message.R;
import com.tibe.message.databinding.FragmentNumberBinding;

public class NumberFragment extends DialogFragment {

    FragmentNumberBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNumberBinding.inflate(inflater, container, false);
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        clickable();

        return binding.getRoot();
    }

    private void clickable() {
        binding.buttonClose.setOnClickListener(v ->{
            dismiss();
        });

        binding.buttonConfirm.setOnClickListener(v ->{

        });
    }
}
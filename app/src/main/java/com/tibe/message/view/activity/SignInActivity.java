package com.tibe.message.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.tibe.message.R;
import com.tibe.message.databinding.ActivitySignInBinding;
import com.tibe.message.model.MaskEditUtil;
import com.tibe.message.view.fragment.NumberFragment;

public class SignInActivity extends AppCompatActivity {

    ActivitySignInBinding binding;
    MaskEditUtil maskEditUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in);

        maskEditUtil = new MaskEditUtil() {
            @NonNull
            @Override
            public String toString() {
                return super.toString();
            }
        };

        binding.inputNumber.addTextChangedListener(MaskEditUtil.mask(
                binding.inputNumber, MaskEditUtil.FORMAT_FONE));

        clickable();
    }

    private void clickable() {
        binding.buttonBack.setOnClickListener(v ->{
            onBackPressed();
        });

        binding.buttonEnter.setOnClickListener(v ->{
            new NumberFragment().show(getSupportFragmentManager(), "NumberFragment");
        });
    }
}
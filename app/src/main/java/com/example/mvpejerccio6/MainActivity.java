package com.example.mvpejerccio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.mvpejerccio6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewPresentador {
    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        presentador = new Presentador(this);
        binding.editPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
presentador.evaluarContraseña(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void showDebil() {
        Toast.makeText(this, "Contraseña Débil", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMedia() {
        Toast.makeText(this, "Media", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFuerte() {
        Toast.makeText(this, "Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {

            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
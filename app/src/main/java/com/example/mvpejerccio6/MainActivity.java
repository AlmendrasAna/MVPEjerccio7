package com.example.mvpejerccio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.mvpejerccio6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewPresentador {
    private Presenter presentador;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        presentador = new Presenter(this);
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

        binding.confirmB.setOnClickListener(v->pl
        {
            String msn = "Su contraseña es "+binding.levelTxt.getText()+".";

            Toast.makeText(this, msn, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public void showDebil() {
        binding.levelTxt.setText("Debil");
        binding.levelTxt.setBackgroundResource(R.color.red);
    }

    @Override
    public void showMedia() {
        binding.levelTxt.setText("Mediana");
        binding.levelTxt.setBackgroundResource(R.color.yellor);
    }

    @Override
    public void showFuerte() {
        binding.levelTxt.setText("Fuerte");
        binding.levelTxt.setBackgroundResource(R.color.green);
    }

    @Override
    public void showError() {

        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
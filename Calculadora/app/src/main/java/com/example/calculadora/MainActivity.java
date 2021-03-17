package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsuario;
    private EditText etContraseña;
    private Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView() {
        etUsuario = findViewById(R.id.txtUsuario);
        etContraseña = findViewById(R.id.txtContraseña);
        btEntrar = findViewById(R.id.btnEntrar);
        btEntrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnEntrar) {
            sendLogin();
        }
    }

    private void sendLogin() {
        if (etUsuario.getText().toString().equalsIgnoreCase("sergio") && etContraseña.getText().toString().equalsIgnoreCase("1234")) {
            Intent calculatorIntent = new Intent(this, calculadora_operaciones.class);
            startActivity(calculatorIntent);
        }
    }
}
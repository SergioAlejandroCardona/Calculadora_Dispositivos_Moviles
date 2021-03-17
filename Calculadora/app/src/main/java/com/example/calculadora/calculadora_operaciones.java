package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculadora_operaciones extends AppCompatActivity {

    private TextView tvDisplay;
    private double n1,n2,res;
    private String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_operaciones);
    }

    public void btnCero(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"0");
    }

    public void btnUno(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"1");
    }

    public void btnDos(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"2");
    }

    public void btnTres(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"3");
    }

    public void btnCuatro(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"4");
    }

    public void btnCinco(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"5");
    }

    public void btnSeis(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"6");
    }

    public void btnSiete(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"7");
    }

    public void btnOcho(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"8");
    }

    public void btnNueve(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+"9");
    }

    public void btnPunto(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(tvDisplay.getText()+".");
    }

    public void onClickOperacionCapturaNumero1(View view){
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        n1 = Double.parseDouble(tvDisplay.getText().toString());
        tvDisplay.setText(" ");
    }

    public void Sumar(View view){
        try {
            Operador = "+";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}
    }

    public void Restar(View view){
        try {
            Operador = "-";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}
    }

    public void Multiplicar(View view){
        try {
            Operador = "*";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}
    }

    public void Dividir(View view){
        try {
            Operador = "/";
            onClickOperacionCapturaNumero1(view);
        }catch (NumberFormatException nfe){}
    }

    public void Porcentaje(View view) {
        try {
            Operador = "%";
            onClickOperacionCapturaNumero1(view);
        } catch (NumberFormatException nfe) {}
    }

        public void btnIgual(View view){
        try {
            tvDisplay = (TextView)findViewById(R.id.tvPantalla);
            n2 = Double.parseDouble(tvDisplay.getText().toString());
            if (Operador.equals("+")){
                res = n1+n2;
            }else if (Operador.equals("-")){
                res = n1-n2;
            }else if (Operador.equals("*")){
                res = n1*n2;
            }else if (Operador.equals("/")){
                res = n1/n2;
            }else if (Operador.equals("%")){
                res = n1*(n2/100);
            }
            tvDisplay.setText(" " + res);
        }catch (NumberFormatException nfe){}
    }

    public void Borrar(View view){
        n1 = 0.0;
        n2 = 0.0;
        tvDisplay = (TextView)findViewById(R.id.tvPantalla);
        tvDisplay.setText(" ");
    }

}
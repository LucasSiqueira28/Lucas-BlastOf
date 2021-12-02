package com.example.appcaixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit_dinheiro;
    private Button bt_scar;
    private TextView saldo;
    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        saldo.setText("Saldo em Conta: " + "R$" + saldoEmConta);

        bt_scar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dinheiro;
                dinheiro = Double.parseDouble(edit_dinheiro.getText().toString());
                if (dinheiro < 20) {
                    Toast.makeText(MainActivity.this, "Digite um valor maior", Toast.LENGTH_SHORT).show();
                } else if (dinheiro == 20) {
                    saldo.setText("Saldo em Conta: " + "R$" + saldoEmConta);
                    Toast.makeText(MainActivity.this, "20,00 sacado", Toast.LENGTH_SHORT).show();
                } else if (dinheiro == 50) {
                    saldo.setText("Saldo em Conta: " + "R$" + saldoEmConta);
                    Toast.makeText(MainActivity.this, "50,00 sacado", Toast.LENGTH_SHORT).show();
                } else if (dinheiro == 100) {
                    saldo.setText("Saldo em Conta: " + "R$" + saldoEmConta);
                    Toast.makeText(MainActivity.this, "100,00 sacado", Toast.LENGTH_SHORT).show();
                }
                else{
                    saldoEmConta -= dinheiro;
                    saldo.setText("Saldo em Conta: " + "R$" + saldoEmConta);
                    Toast.makeText(MainActivity.this, + dinheiro + "0" + "Reais sacados", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    private void IniciarCommponentes(){
        edit_dinheiro = findViewById(R.id.dinheiro);
        bt_scar = findViewById(R.id.btn_sacar);
        saldo = findViewById(R.id.saldo);
    }
}
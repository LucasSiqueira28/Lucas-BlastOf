package com.example.objetojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Carro carro; //chamando a classe carro na "main"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carro = new Carro();
        System.out.println(carro.cor);
    }
}
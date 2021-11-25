package com.example.objetojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Carro carro; //chamando a classe carro na "main"
    private Veiculo veiculo;
    private Carro carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        veiculo = new Veiculo("vermelho", 5, "fusca", 1990, "Gasolina" );
        carro = new Carro("Preto", 3, "Triciclo", 2010, "Diesel");


        System.out.println(veiculo.getMarca() +" "+ carro.getMarca());
        System.out.println(veiculo.getCor()+" "+ carro.getCor());
        System.out.println(veiculo.getAno()+" "+ carro.getAno());
        System.out.println(veiculo.getCombustivel()+" "+ carro.getCombustivel());
        System.out.println(veiculo.getRodas()+" "+ carro.getRodas());

        carro.veiculoAndar();
        carro.veiculoFrear();;
    }
}
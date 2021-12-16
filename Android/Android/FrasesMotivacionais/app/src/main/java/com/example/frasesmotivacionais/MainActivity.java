package com.example.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        getSupportActionBar().hide(); //esconder a action bar

        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] frasesMotivacionais = {"Na vida um monte de gente sabe o que fazer, mas poucos fazem, de fato, o que sabem que é preciso.Saber não é o suficiente. Você precisa agir",
                        "Saiba que são suas decisões, e não suas condições, que determinam seu destino",
                        "Se você faz o que sempre fez, você obterá o que você sempre obteve",
                        "É nos momentos de decisão que o seu destino é traçado",
                        "Onde há foco a energia flui"
                };

                Random random = new Random();
                int aleatorios = random.nextInt(frasesMotivacionais.length);

                frases.setText(frasesMotivacionais[aleatorios]);
            }
        });

    }
}
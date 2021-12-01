package com.example.appcaixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Senha extends AppCompatActivity {
    private EditText senha;
    private Button botaoconfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        senha = findViewById(R.id.edit_senha);
        botaoconfirmar = findViewById(R.id.bt_confirmar);

        getSupportActionBar().hide();

        botaoconfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int senhaCadastrada = 686500;
                int senhaAtual;

                senhaAtual = Integer.parseInt(senha.getText().toString());

                if(senhaAtual == senhaCadastrada){
                    //Toast.makeText(Senha.this, "Senha Ok", Toast.LENGTH_SHORT).show();
                    irParaActivityPrincipal();
                } else {
                    Toast.makeText(Senha.this, "Senha Errada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void irParaActivityPrincipal(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
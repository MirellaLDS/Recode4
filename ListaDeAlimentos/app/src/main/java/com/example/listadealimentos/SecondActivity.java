package com.example.listadealimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String mensagemRecebida = getIntent().getStringExtra("IDENTIFICADOR_DA_MENSAGEM_ENVIADA");


        TextView textView = findViewById(R.id.tvMensagemRecebida2);
        textView.setText(mensagemRecebida);


//    DICA:    startActivityForResult();
    }


}
package com.example.intentchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent mensageiro = getIntent();
        String mensagem = mensageiro.getStringExtra("IDENTIFICADOR_DA_MENSAGEM_ENVIADA");

        TextView textView = findViewById(R.id.tvMensagemRecebida1);
        textView.setText(mensagem);
    }

    public void enviarMensagem(View view) {
        EditText editText = findViewById(R.id.etMensagem2);
        String resposta = editText.getText().toString();

        Intent intentDeResposta = new Intent();
        intentDeResposta.putExtra("ID_MENSAGEIRO_RESPOSTA", resposta);
        setResult(RESULT_OK, intentDeResposta);
        finish();
    }
}
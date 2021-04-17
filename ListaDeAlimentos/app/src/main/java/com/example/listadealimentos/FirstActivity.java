package com.example.listadealimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    static final String TAG = FirstActivity.class.getSimpleName();


    private EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.i(TAG, "onCreate");

        editText = findViewById(R.id.etEntradaDeTexto1);
    }

    public void enviarMensagem(View view) {
        String mensagemCapturada = editText.getText().toString();

        Intent mensageiro = new Intent(this, SecondActivity.class);
        mensageiro.putExtra("IDENTIFICADOR_DA_MENSAGEM_ENVIADA", mensagemCapturada);
        startActivity(mensageiro);

    }
}
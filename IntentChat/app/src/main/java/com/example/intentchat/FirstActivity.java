package com.example.intentchat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    static final String TAG = FirstActivity.class.getSimpleName();

    private EditText editText = null;

    final static int ID_MENSAGEIRO = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i(TAG, "onCreate");

        editText = findViewById(R.id.etEntradaDeTexto1);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == ID_MENSAGEIRO) {
            if (resultCode == RESULT_OK) {

                String respostaDaTela2 =  data.getStringExtra("ID_MENSAGEIRO_RESPOSTA");

                TextView textView = findViewById(R.id.tvMensagemRecebida1);
                textView.setText(respostaDaTela2);
            }
        }


    }

    public void abrirTela(View view) {
        String mensagemCapturada = editText.getText().toString();

        Intent mensageiro = new Intent(this, SecondActivity.class);
        mensageiro.putExtra("IDENTIFICADOR_DA_MENSAGEM_ENVIADA", mensagemCapturada);
        startActivityForResult(mensageiro, ID_MENSAGEIRO);
    }
}
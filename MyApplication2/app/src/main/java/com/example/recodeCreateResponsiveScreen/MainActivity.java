package com.example.recodeCreateResponsiveScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int valorDaSoma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma(View view) {
        valorDaSoma += 1;

        TextView componenteDeTexto = findViewById(R.id.textView);

        componenteDeTexto.setText(String.valueOf(valorDaSoma));
    }

    public void mostrarMensagem(View botao1) {
        Toast.makeText(this, "Mensagem do botão 1", Toast.LENGTH_LONG).show();
    }
}
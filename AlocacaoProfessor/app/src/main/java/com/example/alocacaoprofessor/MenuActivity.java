package com.example.alocacaoprofessor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void abrirTelaCurso(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
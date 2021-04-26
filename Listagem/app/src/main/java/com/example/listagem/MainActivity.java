package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> nomeDosAlunos = new ArrayList<>();
        nomeDosAlunos.add("Newton");
        nomeDosAlunos.add("Catarina");
        nomeDosAlunos.add("Mirella");
        nomeDosAlunos.add("Gustavo");
        nomeDosAlunos.add("Gabriel");
        nomeDosAlunos.add("Tadeu");

        ProfessorAdapter professorAdapter = new ProfessorAdapter(MainActivity.this, R.layout.activity_dois, nomeDosAlunos);

        ListView viewDeLista = findViewById(R.id.lvLista);

        viewDeLista.setAdapter(professorAdapter);

    }
}
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


        ListView viewDeLista = findViewById(R.id.lvListagem);

        // Gerenciador Padrão
        ArrayAdapter gerenciadorAdapter = new ArrayAdapter(this, R.layout.item_da_lista, nomeDosAlunos);

        // Gerenciador Custom
        ListagemAdapter listagemAdapter = new ListagemAdapter(this, R.layout.item_da_lista, nomeDosAlunos);

        viewDeLista.setAdapter(listagemAdapter);


//        viewDeLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Toast.makeText(MainActivity.this, "Mensagem de Click", Toast.LENGTH_SHORT).show();
//
//            }
//        });

    }
}
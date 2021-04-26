package com.example.alocacaoprofessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.nomeCurso);


        RetrofitConfiguration configuration = new RetrofitConfiguration();

        Call<List<Curso>> call = configuration.getCursosService().getCursos();

        call.enqueue(new Callback<List<Curso>>() {
            @Override
            public void onResponse(Call<List<Curso>> call, Response<List<Curso>> response) {

                List<Curso> cursoList = response.body();

                textView.setText(cursoList.get(5).getName());

                if (cursoList != null) {
                    for (Curso curso : cursoList) {
                        Log.i(MainActivity.class.getSimpleName(), curso.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Curso>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Falha na requisição", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
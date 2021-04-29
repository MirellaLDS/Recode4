package com.example.alocacaoprofessor.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alocacaoprofessor.R;
import com.example.alocacaoprofessor.model.Departamento;
import com.example.alocacaoprofessor.repository.RetrofitConfiguration;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetalheDoItemActivity extends AppCompatActivity {

    private TextView tvNome, tvId;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_do_item);

        tvId = findViewById(R.id.tvItemId);
        tvNome = findViewById(R.id.tvItemName);

        editText = findViewById(R.id.etItemId);

    }

    public void pegarDepatamentoNoServidor(View view) {

        String idDoDepartamento = editText.getText().toString();

        if (idDoDepartamento != null && idDoDepartamento != "") {
            int idDepartamento = Integer.parseInt(idDoDepartamento);

            RetrofitConfiguration configuration = new RetrofitConfiguration();
            Call<Departamento> departamentoRequest = configuration.getDepartamentoService().getDepartamentoByID(idDepartamento);

            departamentoRequest.enqueue(new Callback<Departamento>() {
                @Override
                public void onResponse(Call<Departamento> call, Response<Departamento> response) {

                    if (response.isSuccessful()) {
                        Departamento departamento = response.body();

                        tvId.setText(String.valueOf(departamento.getId()));
                        tvNome.setText(departamento.getName());

                    } else {
                        Toast.makeText(DetalheDoItemActivity.this, "Item procurado não existe", Toast.LENGTH_LONG).show();
                    }

                }

                @Override
                public void onFailure(Call<Departamento> call, Throwable t) {
                    Toast.makeText(DetalheDoItemActivity.this, "Requisição para API de Departamento by ID falhou", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}
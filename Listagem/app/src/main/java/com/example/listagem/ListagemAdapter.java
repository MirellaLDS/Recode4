package com.example.listagem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class ListagemAdapter extends ArrayAdapter {

    private Context context;
    private List<String> lista;
    private int layout;

    public ListagemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.context = context;
        this.lista = objects;
        this.layout = resource;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Criando uma referencia ao layout do item na lista
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(layout, parent, false);
        }

        // Pego o objeto que quero exibir no layout montando anteriormente
        String nomeDoAluno = lista.get(position);

        TextView tvTexto = itemView.findViewById(R.id.tvItem);

        tvTexto.setText(nomeDoAluno);

        if (nomeDoAluno == "Mirella") {
            ImageView imageView = itemView.findViewById(R.id.ivImagem);

            imageView.setImageResource(R.drawable.android_os);
        }

        ConstraintLayout constraintLayout = itemView.findViewById(R.id.paiDeTodos);

        tvTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, nomeDoAluno, Toast.LENGTH_LONG).show();

            }
        });

        return itemView;
    }
}

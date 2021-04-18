package com.example.listcandiesproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CandyAdapter extends ArrayAdapter<Candy> {

    private Context context;
    private List<Candy> lista;
    private int resourceLayout;

    public CandyAdapter(@NonNull Context context, int resource, List<Candy> lista) {
        super(context, resource, lista);

        this.context = context;
        this.lista = lista;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Criar referencia de layout na memoria
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(resourceLayout, parent, false);
        }

        // Pegar item da colecao
        Candy candy = lista.get(position);

        ImageView imageView = itemView.findViewById(R.id.ivCandy);
        imageView.setImageResource(candy.getResourceImage());

        TextView textView = itemView.findViewById(R.id.tvCandyDescription);
        textView.setText(candy.getDescription());

        return itemView;
    }
}

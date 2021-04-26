package com.example.listagem;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
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

public class ProfessorAdapter extends ArrayAdapter {

    Context context;
    int resource;
    List<String> listaDeProfessores;

    public ProfessorAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.listaDeProfessores = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(resource, parent, false);
        }

        String professor = listaDeProfessores.get(position);
        TextView tvNomeProfessor = view.findViewById(R.id.tvNome);
        tvNomeProfessor.setText(professor);

        ConstraintLayout layoutPai = view.findViewById(R.id.container_pai);
        layoutPai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, professor, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, MainActivity2.class);
                context.startActivity(intent);

            }
        });

        return view;
    }

}

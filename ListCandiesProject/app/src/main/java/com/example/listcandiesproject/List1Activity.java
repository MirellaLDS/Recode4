package com.example.listcandiesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class List1Activity extends AppCompatActivity {

    List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        ListView listView = findViewById(R.id.lvCandies);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, supplierNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String clickedItem = (String) listView.getItemAtPosition(position);
            Toast.makeText(List1Activity.this, clickedItem, Toast.LENGTH_SHORT).show();
        });
    }
}
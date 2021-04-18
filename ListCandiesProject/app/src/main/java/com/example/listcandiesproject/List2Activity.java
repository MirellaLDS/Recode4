package com.example.listcandiesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class List2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        List<Candy> supplierNames = Arrays.asList(
                new Candy(R.drawable.donut_circle, getString(R.string.candy_description)),
                new Candy(R.drawable.froyo_circle, getString(R.string.candy_description)),
                new Candy(R.drawable.icecream_circle, getString(R.string.candy_description)));

        ListView listView = findViewById(R.id.lvCandies2);
        CandyAdapter candyAdapter = new CandyAdapter(this, R.layout.list_view_item, supplierNames);

        listView.setAdapter(candyAdapter);
    }
}
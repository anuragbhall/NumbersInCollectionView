package com.example.numbersincollectionview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


            GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
            recyclerView.setLayoutManager(layoutManager);

            Numbers[] numbers = Numbers.numbers;

            adapter = new RecyclerViewAdapter(numbers);

            recyclerView.setAdapter(adapter);


    }

}